/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
    private Player player;

    public World() {
        super();
        player = new Player(800, 600);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        player.draw(g);
//        int counter = 0;
//        while(counter < 20) {
//            if (counter % 3 == 0) {
//                g.setColor(Color.RED);
//            }
//            else {
//                g.setColor(Color.GREEN);
//            }
//            
//            g.fillRect(30*counter,30*counter,25,25);
//            counter++;
//        }
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
