package data.Enemies;

import android.media.Image;

import data.Projectiles.Projectile;

/**
 * Created by Julius on 23.07.2016.
 */
public class Enemy {
    private int health, damage, xPos, yPos;
    private Image image;
    private Projectile projectile;

    public Enemy(int hp, int dmg, int pspd, Image img, int x, int y, Image pimg){
        this.health = hp;
        this.damage = dmg;
        this.image = img;
        this.xPos = x;
        this.yPos = y;
        this.projectile = new Projectile(dmg, pspd, pimg);
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
