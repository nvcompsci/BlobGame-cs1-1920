/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author jword
 */
public class Missile {
    //Fields
    private int x, y, vx, vy, width, height;
    private boolean alive = true;
    private final int SPEED = 7;
    private final Color COLOR = Color.WHITE;
    private Rectangle bounds;
    
    //Constructor
    public Missile(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 10;
        this.height = 2;
        this.vx = SPEED;
        this.vy = 0;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public boolean isAlive() {
        return alive;
    }

    public void die() {
        this.alive = false;
        this.vx = 0;
        this.vy = 0;
    }
    
    
    
    public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, width, height);
    }
}
