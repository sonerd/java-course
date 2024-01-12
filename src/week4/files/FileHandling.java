package week4.files;

import entities.Human;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandling {

    public static void main(String[] args) {

        // 1. You have a file humans-input.txt containing human data as CSV format
        // 2. Read the humans from this file (list of Human objects)
        // 3. Create a CSV file for each nationality and write into it only the humans for that nationality
        // 4. e.g. chinese.txt -> Chen;Long;chinese
        //         spanish.txt -> Antonio;Silva;spanish
        //         sout the amount of people in each nationality file. (one big output)

        File filePath = new File("C:\\Users\\USER\\OneDrive\\Documents\\GitHub\\java-course\\humans-input.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            List<Human> listHumanObjects = new ArrayList<>();
            List<String> allLines = reader.lines().collect(Collectors.toList());
            for(String line:allLines){
                String[] attributes = line.split(";");
                listHumanObjects.add(new Human(attributes[0],attributes[1],attributes[2]));
            }
            for(Human human:listHumanObjects){
                try{
                    String nationality = human.getNationality();
                    File humanText = new File(nationality+".txt");
                    if(!humanText.exists()){

                        humanText.createNewFile();

                    }

                    BufferedWriter writer = new BufferedWriter(new FileWriter(humanText,true));
                    writer.write(human.getFirstName()+";"+human.getLastName()+";"+human.getNationality());
                    writer.newLine();
                    writer.flush();
                    writer.close();
                    }
                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }


        }
        catch (FileNotFoundException e){
            System.out.println("File not found because: " + e.getMessage());
        }

    }
}
