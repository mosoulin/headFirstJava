package lessons.headFirstJava.midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

/**
 * Created by Admin on 25.07.16.
 */
public class Main {
    public static void main(String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();

    }
}
