package himanshu.in.Entities;

import himanshu.in.resources.Resources;



public class SadPakia extends Entity {


    public SadPakia(int x, int y) {
        super(x, y);
        this.height = 50;
        this.width = 50;
        this.xVel = 0;
        this.yVel = 0;
        this.image = Resources.sadPakia;
        this.isLimitExceed = false;
        this.sound = Resources.jump1;
    }

    @Override
    public void collide(Entity e) {
        e.xVel = -25;
        e.yVel = 0;
    }
}
