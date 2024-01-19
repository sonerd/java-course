package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.println("Enter fruit names (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine().trim(); // Read user input
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit loop if user types 'exit'
            }
            fruits.add(input); // Add input to the list of fruits
        }

        System.out.println("List of fruits entered:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit); // Display the collected fruit names
        }

        scanner.close();

    }
}
