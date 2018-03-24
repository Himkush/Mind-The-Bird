package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class HappyPakia extends Entity {

    public HappyPakia(int x, int y) {
        super(x, y);;
        this.height = 50;
        this.width = 50;
        this.xVel = 0;
        this.yVel = 0;
        this.image = Resources.happyPakia;
        this.isLimitExceed = false;
        this.sound = Resources.jump3;

    }


    @Override
    public void collide(Entity e) {
        this.yVel = -20;
        this.xVel = 0;
    }
}
