package week5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Sliderpro extends JFrame implements ActionListener {   // Why do we need to use extend JFrame?

    /*
   // JFrame mainFrame = new JFrame("Slider");
  //  JPanel mainPanel = new JPanel();

    private static int toC(int f){
        int c;
        return c = (f-32)*5/9;
    };


    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Slider");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        mainPanel.setSize(200,600);
        mainFrame.add(mainPanel);
        JSlider slider = new JSlider(1,0,100,50);
        slider.setPreferredSize(new Dimension(100,200));
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(20);
        JLabel sliderLabel = new JLabel("F: ");
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPanel.add(sliderLabel);
        mainPanel.add(slider);
        JLabel cLabel = new JLabel("C: ");
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int f = slider.getValue();
                sliderLabel.setText("F: "+ f +" " + "C: " + toC(f));
            }
        });

    }

    */

    static JFrame mainFrame = new JFrame("Faris Alali");
    JMenuBar menuBar = new JMenuBar();
    JMenu home = new JMenu();
    JMenu about = new JMenu();
    JMenu blog = new JMenu();
    JMenu contact = new JMenu();

    JMenuItem vision;
    JMenuItem mission;
    JMenuItem podcast;
    JMenuItem article;
    JMenuItem donate;
    JMenuItem close;
    JMenuItem address;


    public Sliderpro(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout());

        menuBar = new JMenuBar();
        home = new JMenu("Home");
        about = new JMenu("About");
        blog = new JMenu("Blog");
        contact = new JMenu("Contact Us");
        menuBar.add(home);
        menuBar.add(about);
        menuBar.add(blog);
        menuBar.add(contact);

        vision = new JMenuItem("Vision");
        mission = new JMenuItem("Mission");
        podcast = new JMenuItem("Podcast");
        article = new JMenuItem("Article");
        close = new JMenuItem("Close");
        address = new JMenuItem("Address");
        donate = new JMenuItem("Donate");

        home.add(close);
        about.add(mission);
        about.add(vision);
        blog.add(article);
        blog.add(podcast);
        contact.add(address);
        contact.add(donate);

        close.addActionListener(this);
        mission.addActionListener(this);
        vision.addActionListener(this);
        article.addActionListener(this);
        podcast.addActionListener(this);
        address.addActionListener(this);
        donate.addActionListener(this);

        this.setJMenuBar(menuBar);
        this.setVisible(true);




    }






    public static void main(String[] args){
        mainFrame.setVisible(true);




        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == home){
            System.out.println("You clicked home menu");
        }
        else if(e.getSource() == about){
            System.out.println("You clicked about menu");
        }
        else if(e.getSource() == blog){
            System.out.println("You clicked blog menu");
        }
        else if(e.getSource() == contact){
            System.out.println("You clicked contact menu");
        }



    }

}
