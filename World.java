/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jword
 */
public class World extends JPanel {
    
    private Timer timer;

    public World() {
        super();
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
    }

    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
            
    }
}
