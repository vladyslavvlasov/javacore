package com.vladyslavvlasov.extrastuff.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by Murcielago on 12.12.2016.
 */
public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            int[] eventsIWant = {127};
            player.addControllerEventListener(this, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            player.setSequence(seq);
            player.setTempoInBPM(220);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void controlChange(ShortMessage event) {
        System.out.println("la");

    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
        }
        return event;
    }
}
