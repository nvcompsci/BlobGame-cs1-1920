/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author jword
 */
public class Player {
    private int height, width, x, y, vx, vy, hp, xp, score;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 15;
    private boolean alive;
    private Image img;
    private ImageIcon ii;
    
    //Constructor
    public Player(int cWidth, int cHeight) {
        this.alive = true;
        this.x = cWidth / 2;
        this.y = cHeight / 2;
        this.vx = 0;
        this.vy = 0;
        this.width = 50;
        this.height = 50;
        this.hp = 100;
        this.xp = 0;
        this.score = 0;
        this.color = Color.CYAN;
        this.ii = new ImageIcon(getClass().getResource("player.png"));
                                    this.img = ii.getImage();
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVy() {
        return vy;
    }

    public boolean isAlive() {
        return alive;
    }

    public Rectangle getBounds() {
        return bounds;
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
        g.drawImage(img, this.x, this.y,
                this.width, this.height, null);
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
