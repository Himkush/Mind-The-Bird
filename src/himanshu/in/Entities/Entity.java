package himanshu.in.Entities;

import javafx.application.Application;
import javafx.scene.media.AudioClip;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;

    public int width;
    public int height;
    public boolean isVisible = true;
    public  boolean powerUp = false;
    public Random rand = new Random();
    public Image image;
    public boolean isLimitExceed;
    public Rectangle rect = new Rectangle();
    public java.applet.AudioClip sound;

    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void update() {
        this.x += this.xVel;
        this.y += this.yVel;
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
    }

    public void updateRect() {

        this.rect.setBounds(this.x, this.y, this.width, this.height);
    }

    public void generateRandom() {
        int y = rand.nextInt(31);
        if (y % 3 == 0) {
            this.isVisible = false;
        }
        else {
            this.isVisible = true;
        }

    }

    public boolean isColliding(Entity other) {
        this.updateRect();
        other.updateRect();
        return (!other.powerUp) && this.isVisible && other.isVisible && this.rect.intersects(other.rect);
    }
    public void collide(Entity e){

    }
    public int addPoints(){
        return 0;
    }


}
