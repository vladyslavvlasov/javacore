package com.vladyslavvlasov.extrastuff.MusicMachine;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Murcielago on 08.12.2016.
 */
public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Sequencer's ready");
        }
        catch (MidiUnavailableException e){
            System.out.println("oops, an exception");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
