package Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon image = new ImageIcon(Main.class.getResource("/MB2079.jpg"));


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setForeground(Color.black);
        //label.setIcon(image);
        label.setBounds(100,100,50,50);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        redpanel.setLayout(null);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }
}
