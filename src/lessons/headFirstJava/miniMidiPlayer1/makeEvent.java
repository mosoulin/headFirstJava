package lessons.headFirstJava.miniMidiPlayer1;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

/**
 * Created by Admin on 28.07.16.
 */
public class makeEvent {
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
