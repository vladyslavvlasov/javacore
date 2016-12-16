package com.vladyslavvlasov.extrastuff.MusicMachine;

import com.vladyslavvlasov.extrastuff.GUI.MyDrawPanel;

import javax.sound.midi.*;
import javax.swing.*;

/**
 * Created by Murcielago on 12.12.2016.
 */
public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("Video");
    static MyDrawPanel panel;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setGUI() {
        panel = new MyDrawPanel();
        f.setContentPane(panel);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go() {
        setGUI();
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();


            player.addControllerEventListener(panel, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            int r = 0;
            for (int i = 0; i < 60; i += 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 11, r, 100, i));
                track.add(makeEvent(176, 11, 127, 0, i));
                track.add(makeEvent(128, 11, r, 100, i + 2));
            }

            player.setSequence(seq);
            player.start();
            player.setTempoInBPM(120);

        } catch (Exception e) {
            e.printStackTrace();
        }
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
