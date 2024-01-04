package week4.files;

import java.io.File;

public class FileMain {

    public static void main(String[] args) {
        final String absolutePath = "/Users/soner/Downloads/Lecture7/BCS15_Fall2023_LectureNotes_AWT_vs_Swing.ppt";
        File fileWithAbsolutePath = new File(absolutePath);
        checkFileExistence(fileWithAbsolutePath);

        File fileWithRelativePath = new File("test.txt");
        checkFileExistence(fileWithRelativePath);

        File directory = new File("/Users/soner/Downloads/Lecture7");
        checkFileExistence(directory);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                System.out.println("File in directory: " + file.getName());
            }
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
