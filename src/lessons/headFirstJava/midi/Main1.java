package lessons.headFirstJava.midi;

import javax.sound.midi.*;

/**
 * Created by Admin on 27.07.16.
 */
public class Main1 {
    public static void main(String[] args) {
        Main1 m = new Main1();
m.play();
    }
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
