package himanshu.in.Entities;

import himanshu.in.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Berry extends Entity {

    private List<Entity> pappuJi = new ArrayList<>();
    public Berry(int x, int y) {
        super(x, y);
        this.height = 42;
        this.width = 30;
        this.xVel = -8;
        this.image = Resources.berries;
        this.isVisible = false;

    }

    @Override
    public void collide(Entity e) {
        Resources.skyColor = new Color(36,56,91);
        Resources.ting.play();
        e.powerUp = true;
        this.isVisible = false;

    }

    @Override
    public boolean isColliding(Entity other) {

        this.updateRect();
        other.updateRect();
        return  this.isVisible && other.isVisible && this.rect.intersects(other.rect);
    }
}
