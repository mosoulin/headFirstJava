package lessons.headFirstJava.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Admin on 28.07.16.
 */
public class Animation {
    int x = 0;
    int y = 0;


    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.go();
    }

   public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        AnimationPanel animationPanel = new AnimationPanel();

        frame.getContentPane().add(animationPanel);

       frame.setSize(500, 500);
       frame.setLocation(320,180);
        frame.setVisible(true);

        for (int i = 0; i < 415; i++) {
            x++;
            y++;
            animationPanel.repaint();
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    class AnimationPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.blue);
            g.fillOval(x,y,50,50);
        }
    }

}
