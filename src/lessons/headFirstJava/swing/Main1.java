package lessons.headFirstJava.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 28.07.16.
 */
public class Main1 implements ActionListener {
    JFrame frame;
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Change color");
        jButton.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, jButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
frame.repaint();
    }
}
