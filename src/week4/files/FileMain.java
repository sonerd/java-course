package week4.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileMain {

    public static void main(String[] args) {
        final String absolutePath = "C:\\Users\\USER\\OneDrive\\Documents\\GitHub\\java-course\\src\\week2";
        File fileWithAbsolutePath = new File(absolutePath);
        checkFileExistence(fileWithAbsolutePath);

        File fileWithRelativePath = new File("test.txt");
        checkFileExistence(fileWithRelativePath);

        // working with directories
        File directory = new File("C:\\Users\\USER\\OneDrive\\Documents\\GitHub\\java-course\\src\\week2");
        checkFileExistence(directory);
        if (directory.isDirectory()) {
            List<String> fileToPrint = new ArrayList<>();
            File[] files = directory.listFiles();
            if(files != null){
                for (File file : files) {
                    fileToPrint.add(file.getName());
               }
            }
            System.out.println(fileToPrint);
        }


        // creating a file
        File tmpFile = new File("tmp.txt");
        if (!tmpFile.exists()) {
            try {
                final boolean createdFile = tmpFile.createNewFile();
                if (createdFile) {
                    System.out.println("File created: " + tmpFile.getName());
                }
            } catch (IOException e) {
                System.out.println("Could not create temporary file, cause: " + e.getMessage());
            }
        } else {
            System.out.println("File " + tmpFile.getName() + " already exist!");
        }

        // reading from a file with FileInputStream
        final File txtFile = new File("text.txt");
        try {
            FileInputStream fis = new FileInputStream(txtFile);
            while(fis.read() != -1) {
                //System.out.println("File input: " + fis.read());
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Cannot read file, cause: " + e.getMessage());
        }


        // reading a text file using BufferedReader
        try {
            BufferedReader reader = new BufferedReader(new FileReader(txtFile));
            String line;
            // using looping
            System.out.println("----Line by Line----");
            while ((line = reader.readLine()) != null) {
                System.out.println("Line of file: " + line);
            }

            // read all lines and store in a list
            System.out.println("----All lines once----");
            reader.reset();
            List<String> allLines = reader.lines().collect(Collectors.toList());
            for (String lineOfFile : allLines) {
                System.out.println("Line of file: " + lineOfFile);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, cause: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot read file, cause: " + e.getMessage());
        }

    }

    private static void checkFileExistence(File file) {
        final String fileName = file.getName();
        if (file.exists()) {
            System.out.println("File " + fileName + " is there!");
        } else {
            System.out.println("File " + fileName + " not found at: " + file.getAbsolutePath());
        }

        if (file.isDirectory()) {
            System.out.println("File " + fileName + " is a directory!");
        }
    }
}
