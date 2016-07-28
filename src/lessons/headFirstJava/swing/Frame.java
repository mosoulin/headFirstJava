package lessons.headFirstJava.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 27.07.16.
 */
public class Frame implements ActionListener {
    JButton button;
    public void show() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button=new JButton("Нажми меня");
        //button.addActionListener(this);
        //frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        //frame.getGraphics().fillOval(50,50,50,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = (int) (Math.random() * 10+1);
        String s="";
        s = s + a;
        button.setText(s);
        System.out.println(button.getText());

    }
}
