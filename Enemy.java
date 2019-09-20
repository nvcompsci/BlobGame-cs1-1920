/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author jword
 */
public class Enemy {
    private int height, width, x, y, vx, vy, hp;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 7;
    private boolean alive;
    
    //Constructor
    public Enemy(int cWidth, int cHeight) {
        this.alive = true;
        this.x = cWidth;
        this.y = (int)(Math.random()*cHeight);
        this.vx = -SPEED;
        this.vy = 0;
        this.width = 30;
        this.height = 30;
        this.hp = 30;
        this.color = Color.RED;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    public Rectangle getBounds() {
        return bounds;
    }
    public boolean isAlive() {
        return alive;
    }
    //Methods
    public void die() {
        this.alive = false;
    }
    public void move(String direction) {        
        if (direction.equals("right"))
            vx = SPEED;
        else if (direction.equals("left"))
            vx = -SPEED;
        else if (direction.equals("up"))
            vy = -SPEED;
        else if (direction.equals("down"))
            vy = SPEED;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(bounds);
        g.fillOval(x, y, width, height);
    }
    
    public void attack() {
        
    }
    
    public void collect() {
        
    }
    
    public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }

    public void stop() {
        this.vx = 0;
        this.vy = 0;
    }
}
