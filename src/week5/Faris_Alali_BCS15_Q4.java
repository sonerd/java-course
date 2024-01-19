package week5; // this is the directory the code was written in

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Faris_Alali_BCS15_Q4 extends JFrame {

    private JTextField nameAndLastNameField;
    private JTextArea freeTextArea;

    public Faris_Alali_BCS15_Q4() {
        super("Faris_Alali_BCS15_Q4");

        // Set layout manager
        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel nameAndLastNameLabel = new JLabel("Name and Last Name:");
        nameAndLastNameField = new JTextField();

        JLabel freeTextLabel = new JLabel("Free Text:");
        freeTextArea = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(freeTextArea);

        JButton buttonForSaving = new JButton("Submit");
        buttonForSaving.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTheFile();
            }
        });


        add(nameAndLastNameLabel);
        add(nameAndLastNameField);
        add(freeTextLabel);
        add(scrollPane);
        add(new JLabel());
        add(buttonForSaving);


        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void saveTheFile() {
        String input = nameAndLastNameField.getText();
        // "Tom Taylor" -> ["Tom", "Taylor"]
        String[] nameAndLastName = input.split(" ");

        if (nameAndLastName.length != 2) {
            JOptionPane.showMessageDialog(this, "Please enter both name and last name separated by a space.");
            return;
        }

        String name = nameAndLastName[0];
        String lastName = nameAndLastName[1];
        String fileName = name + "_" + lastName + "_BCS15_Q4.txt";
        String content = freeTextArea.getText();

        int charCount = content.replaceAll("\\n", "").length();
        int lineCount = content.split("\\n").length;

        // since java 7 "try with resources" will automatically close the resource (file)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            // Display message
            JOptionPane.showMessageDialog(this, "File saved successfully!\nFile Name: " + fileName +
                    "\nNumber of Characters: " + charCount + "\nNumber of Lines: " + lineCount);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Faris_Alali_BCS15_Q4();
            }
        });
    }
}
