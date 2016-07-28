package lessons.headFirstJava.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 28.07.16.
 */
public class Main2 {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.go();
    }

    void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Change color");
        jButton.addActionListener(new ColorListener());
        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener());

        label = new JLabel();
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, jButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.setSize(500, 500);
        frame.setVisible(true);
        label.setText("Ololo");
    }

    private class ColorListener implements ActionListener { // внутренний класс
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    private class LabelListener implements ActionListener {  // внутренний класс
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Trololo");
        }
    }
}
