package lessons.headFirstJava.midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

/**
 * Created by Admin on 25.07.16.
 */
public class MusicTest {

    public void play() {

        try {
            Sequencer sequence = MidiSystem.getSequencer();
            System.out.println("Успешно установили синтезатор");
        } catch (MidiUnavailableException e) {
            System.out.println("Неудача");
        }
    }

}
