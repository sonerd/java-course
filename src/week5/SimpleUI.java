package week5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleUI {
    static int num = 0;
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Click Counter");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,2));
        JLabel label = new JLabel("Number of clicks: "+ num);
        JButton button = new JButton("Im a swing button");
        mainPanel.add(button);
        mainPanel.add(label);

        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num++;
                label.setText("Number of clicks: "+ num);
            }
        });



    }
}
