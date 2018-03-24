package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class Ground extends Entity {


    public Ground(int x, int y) {
        super(x, y);
        this.height = 500;
        this.width = 1000;
        this.xVel = -8;
        this.image = Resources.ground;

    }
}
