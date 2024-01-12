package week4.files;

import entities.Human;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWritingMain {

    public static void main(String[] args) {

        // Writing of files
        final File file = new File("output.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(55);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot write: " + e.getMessage());
        }

        System.out.println("------------------------");
        try {
            File txtFile = new File("output-file.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(txtFile));

            writer.write("Hello World!");
            writer.newLine();
            writer.write(" Hello Faris!");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Cannot write: " + e.getMessage());
        }

        // 1. Create a list of Human objects
        // 2. write all humans of the list to a CSV file using ; as separator

        Human humanOne = new Human("Jake","Paul","British");
        Human humanTwo = new Human("Eric","Kevin","Spanish");
        Human humanThree = new Human("Shanar","AlDousiri","Saudi");

        List<Human> listOfHumans = new ArrayList<>();
        listOfHumans.add(humanOne);
        listOfHumans.add(humanTwo);
        listOfHumans.add(humanThree);
        try{
            File humansFile = new File("Humans.txt");
            if(!humansFile.exists()){
                humansFile.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(humansFile,true));
            for(Human human : listOfHumans){
                String line = human.getFirstName() + ";" + human.getLastName() + ";" + human.getNationality();
                writer.write(line);
                writer.newLine();

            }
            writer.flush();
            writer.close();
        } catch (IOException e){
            System.out.println("Could not write because: "+ e.getMessage());
        }
    }
}
