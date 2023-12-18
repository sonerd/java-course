package week2.ui;

import javax.swing.JFrame;

public class MainUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My UI Application"); // Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(400, 300); // Width, Height
        frame.setVisible(true); // Show the window
    }
}
