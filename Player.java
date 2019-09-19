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
public class Player {
    private int height, width, x, y, hp, xp, score;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 5;
    
    //Constructor
    public Player(int cWidth, int cHeight) {
        this.x = cWidth / 2;
        this.y = cHeight / 2;
        this.width = 50;
        this.height = 50;
        this.hp = 100;
        this.xp = 0;
        this.score = 0;
        this.color = Color.CYAN;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    //Methods
    public void move(String direction) {        
        if (direction.equals("right"))
            x += SPEED;
        else if (direction.equals("left"))
            x -= SPEED;
        else if (direction.equals("up"))
            y -= SPEED;
        else if (direction.equals("down"))
            y += SPEED;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fill(bounds);
    }
    
    public void attack() {
        
    }
    
    public void collect() {
        
    }
    
    public void update() {
        
    }
}
