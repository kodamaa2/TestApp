package data;

import android.media.Image;

/**
 * Created by Julius on 23.07.2016.
 */
public class Player {
    private int health, damage, xPos, yPos;
    private Image image;

    public Player(int hp, int dmg, Image img, int x, int y){
        this.health = hp;
        this.damage = dmg;
        this.image = img;
        this.xPos = x;
        this.yPos = y;
    }

    public int getHealth(){
        return health;
    }

    public void changeHealth(int change){
        health += change;
    }

    public int getDamage(){
        return damage;
    }

    public int getxPos(){
        return xPos;
    }

    public int getyPos(){
        return yPos;
    }

    public void move(int dir){
        switch(dir)
        {
            case 0:
                xPos++; break;
            case 1:
                xPos--; break;
            case 2:
                yPos++; break;
            case 3:
                yPos--; break;
        }
    }
}
