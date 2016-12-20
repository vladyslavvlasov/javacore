package com.vladyslavvlasov.extrastuff.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

/**
 * Created by Murcielago on 14.12.2016.
 */
public class SuperBallApp implements MouseListener {
    static int origHeight;
    JFrame frame;
    BallDrawPanel drawPanel;
    int x;
    int y;
    final int velocity = 3;
    int gravity = 8;
    static int changer = 0;


    public static void main(String[] args) {
        SuperBallApp newApp = new SuperBallApp();
        newApp.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        drawPanel = new BallDrawPanel();
        frame.getContentPane().add(drawPanel);
        drawPanel.addMouseListener(this);
        frame.setSize(800, 500);
        frame.setVisible(true);
        moveBall();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        changer = 1;
        origHeight = e.getY();
        x = e.getX();
        y = e.getY();
        frame.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    class BallDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            setBackground(Color.black);
            int red = (int) (Math.random() * 250);
            int green = (int) (Math.random() * 250);
            int blue = (int) (Math.random() * 250);
            Color newCol = new Color(red, green, blue);
            g.setColor(Color.black);
            g.fillRect(0, 0, 800, 500);
            if (changer > 0) {
                g.setColor(Color.red);
                g.fillOval(x, y, 30, 30);
            }
        }
    }

    public void moveBall() {
        while (x < frame.getWidth()) {
            x = x + velocity;
            y = y + gravity;
            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
            frame.repaint();
            if (y + 70 > frame.getHeight()) {
                gravity = gravity - 2;
                //origHeight=origHeight*2;
                moveUp();
            }
        }
    }

    public void moveUp() {
        while (y > origHeight) {
            origHeight += 2;
            x = x + velocity;
            y = y - gravity;
            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
            frame.repaint();
        }
    }
}
