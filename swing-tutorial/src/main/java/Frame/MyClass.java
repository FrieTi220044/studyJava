package Frame;

import javax.swing.*;
import java.awt.*;

public class MyClass extends JFrame {
    public MyClass () {
        super("Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        ImageIcon image = new ImageIcon(getClass().getResource("/logo.png"));
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(178,10,122));

        repaint();
        revalidate();


    }
}
