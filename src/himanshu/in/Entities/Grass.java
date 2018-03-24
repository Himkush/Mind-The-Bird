package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class Grass extends Entity {
    public Grass(int x, int y) {
        super(x, y);
        this.height = 500;
        this.width = 1000;
        this.xVel = -8;
        this.image = Resources.grass;

    }
}
