package himanshu.in.Entities;

import himanshu.in.resources.Resources;

import java.awt.*;

public class Star extends Entity {

    public Star(int x, int y) {
        super(x, y);
        this.height = 38;
        this.width = 38;
        this.xVel = -8;
        this.image = Resources.star;
        this.isVisible = false;
    }

    @Override
    public void collide(Entity e) {
        Resources.skyColor = new Color(232,153,32);

        Resources.ting.play();
        e.powerUp = true;
        this.isVisible =false;

    }
    public boolean isColliding(Entity other) {
        this.updateRect();
        other.updateRect();
        return  this.isVisible && other.isVisible && this.rect.intersects(other.rect);
    }


}
