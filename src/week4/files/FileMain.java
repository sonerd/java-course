package week4.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileMain {

    public static void main(String[] args) {
        final String absolutePath = "C:\\Users\\USER\\OneDrive\\Documents\\GitHub\\java-course\\src\\week2";
        File fileWithAbsolutePath = new File(absolutePath);
        checkFileExistence(fileWithAbsolutePath);

        File fileWithRelativePath = new File("test.txt");
        checkFileExistence(fileWithRelativePath);

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
