package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon(Main.class.getResource("/logo.png"));
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("I love Hanna <3 ");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// for horizontal position
        label.setVerticalTextPosition(JLabel.TOP); // for vertical position
        label.setForeground(Color.white); // color for text
        label.setFont(new Font("Mv Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-80); // set gap of text to image
        label.setBackground(Color.black); // background color
        label.setOpaque(true);// display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of Icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of Icon+text within label
        // label.setBounds(100,100,350,350); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
