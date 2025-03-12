package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame () {

        label = new JLabel();
        label.setText("You have pressed the button!!");
        label.setBounds(150, 250, 250,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100,250,100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); disables a Button


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // System.out.println("poo");
            label.setVisible(true);
            //button.setEnabled(false); disables a Button (in this methods its for one time click button)
        }
    }
}
