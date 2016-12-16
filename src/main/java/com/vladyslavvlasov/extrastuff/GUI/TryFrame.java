package com.vladyslavvlasov.extrastuff.GUI;

import javax.swing.*;

/**
 * Created by Murcielago on 10.12.2016.
 */
public class TryFrame {
    public static void main(String[] args) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        JFrame frame =new JFrame();
        JButton button = new JButton("Yo! CLick me");
        frame.getContentPane().add(button);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}
