package week4.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingMain {

    public static void main(String[] args) {

        // Writing of files
        final File file = new File("output.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(1);
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
    }
}
