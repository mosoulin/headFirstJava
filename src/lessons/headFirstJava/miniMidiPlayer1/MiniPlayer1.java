package lessons.headFirstJava.miniMidiPlayer1;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Admin on 28.07.16.
 */
public class MiniPlayer1 implements ControllerEventListener {

    static JFrame f = new JFrame();
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniPlayer1 miniPlayer = new MiniPlayer1();
        miniPlayer.go();
    }

    public void showFrame() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

   public void go() {
        showFrame();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

           // int eventsIwant[] = {127};
            sequencer.addControllerEventListener(ml, new int[]{127});

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();
            int r = 0;
            for (int i = 5; i < 60; i += 4) {
                track.add(makeEvent.makeEvent(144, 1, r, 100, i));

                track.add(makeEvent.makeEvent(176, 1, 127, 0, i)); // ловим ритм, добавляем событие на 176, 176 - ControllerEventListener

                track.add(makeEvent.makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.start();
            sequencer.setTempoInBPM(220);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void controlChange(ShortMessage event) {

        System.out.println("Ля ");

    }
    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;


        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) g;

                int r =(int) (Math.random() * 250);
                int gr =(int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);
                g.setColor(new Color(r, gr, b));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);
                g.fillRect(x, y, ht, width);
                msg = false;
            }
        }
    }

}
