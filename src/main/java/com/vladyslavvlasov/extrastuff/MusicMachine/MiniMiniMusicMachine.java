package com.vladyslavvlasov.extrastuff.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by Murcielago on 09.12.2016.
 */
public class MiniMiniMusicMachine {
    public static void main(String[] args) {
        MiniMiniMusicMachine mini = new MiniMiniMusicMachine();
        mini.play();
    }
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence sequence = new Sequence(Sequence.PPQ,4);
            Track track = sequence.createTrack();

            ShortMessage first = new ShortMessage();
            ShortMessage a = new ShortMessage();
            first.setMessage(192,1,102,0);
            a.setMessage(144, 1, 102, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(sequence);
            player.start();
        }



        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
