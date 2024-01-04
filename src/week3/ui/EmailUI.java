package week3.ui;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmailUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Job Application UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();
        JLabel emailLabel = new JLabel("Email Address:");
        JTextField emailField = new JTextField();
        JLabel messageLabel = new JLabel("Message:");
        JTextArea messageArea = new JTextArea();
        JButton sendButton = new JButton("Send");

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(messageLabel);
        panel.add(new JScrollPane(messageArea));
        panel.add(sendButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String message = messageArea.getText();

                // Sending an email using JavaMail API
                sendEmail(firstName, lastName, email, message, frame);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void sendEmail(final String firstName, final String lastName, final String email, final String message, final JFrame frame) {
        String host = "smtp.gmail.com";
        String port = "587";
        String username = ""; // Your Gmail username
        String password = ""; // Your Gmail password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message mailMessage = new MimeMessage(session);
            mailMessage.setFrom(new InternetAddress(username));
            mailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            mailMessage.setSubject("Message Received");
            mailMessage.setText("Dear " + firstName + " " + lastName + ",\n\n" + "We have received your application.");

            Transport.send(mailMessage);

            JOptionPane.showMessageDialog(frame, "Email Sent Successfully!");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }
}

