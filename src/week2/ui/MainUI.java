package week2.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
        JLabel currencyInputLabel = new JLabel("Enter the amount: ");
        JTextField currencyInput = new JTextField();
        panel.add(currencyInputLabel);
        panel.add(currencyInput);
        JLabel conversionRateLabel = new JLabel("Enter the rate: ");
        JTextField conversionRate = new JTextField();
        panel.add(conversionRateLabel);
        panel.add(conversionRate);
        JLabel outputLabel = new JLabel("The output");
        panel.add(outputLabel);
        JLabel outputLabelAmount = new JLabel("0");
        panel.add(outputLabelAmount);

        // Button
        JButton convertButton = new JButton("Convert");
        panel.add(convertButton);
        JButton convertButtonReverse = new JButton("Convert Reverse");
        panel.add(convertButtonReverse);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
               String inputAmount = currencyInput.getText();
               String inputRate = conversionRate.getText();
               if(inputAmount.isBlank() || !isNumber(inputAmount)){
                   JOptionPane.showMessageDialog(frame,"Please input a number");
               }

               double inputAmountDouble = Double.parseDouble(inputAmount);
                if(inputRate.isBlank() || !isNumber(inputRate)){
                    JOptionPane.showMessageDialog(frame,"Please input a number");
                }
               double inputRateDouble = Double.parseDouble(inputRate);

               double convertedRate = inputAmountDouble * inputRateDouble;
                outputLabelAmount.setText(String.valueOf(Math.round(convertedRate * 100.0) / 100.0));
            }
        });

        convertButtonReverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                String inputAmount = currencyInput.getText();
                String inputRate = conversionRate.getText();
                if(inputAmount.isBlank() || !isNumber(inputAmount)){
                    JOptionPane.showMessageDialog(frame,"Please input a number");
                }

                double inputAmountDouble = Double.parseDouble(inputAmount);
                if(inputRate.isBlank() || !isNumber(inputRate)){
                    JOptionPane.showMessageDialog(frame,"Please input a number");
                }
                double inputRateDouble = Double.parseDouble(inputRate);

                double convertedRate = inputAmountDouble / inputRateDouble;
                outputLabelAmount.setText(String.valueOf(Math.round(convertedRate * 100.0) / 100.0));
            }
        });

    }
    private static boolean isNumber(String numToCheck){
        try{
            Double.parseDouble(numToCheck);
            return true;
        } catch (NumberFormatException e){
        return false;
        }
    }
}
