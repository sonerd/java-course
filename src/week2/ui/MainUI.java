package week2.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainUI {

    public static void main(String[] args) {
        // create a UI to convert from one currency to another
        // the UI should have one
        // - textfield for the input currency
        // - textfield for the conversion rate
        // - textfield for the converted currency as output
        // - button to trigger the conversion


        JFrame frame = new JFrame("Currency Converter"); // Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(400, 300); // Width, Height
        frame.setVisible(true); // Show the window

        // panel
        JPanel panel = new JPanel();

        // layout manager
        GridLayout gridLayout = new GridLayout(4, 2);
        panel.setLayout(gridLayout);

        frame.add(panel);

        // TextField
        JTextField textField = new JTextField();
        panel.add(textField);

        // Button
        JButton okButton = new JButton("Convert");
        panel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.out.println("Pressed OK " + textField.getText());
            }
        });

    }
}
