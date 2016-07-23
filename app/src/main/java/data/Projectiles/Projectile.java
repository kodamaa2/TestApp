package data.Projectiles;

import android.media.Image;

/**
 * Created by Julius on 23.07.2016.
 */
public class Projectile {
    private int damage, speed;
    private Image image;
    public Projectile(int dmg, int spd, Image img)
    {
        this.damage = dmg;
        this.speed = spd;
        this.image = img;
    }
}
