package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class AngryPakia extends Entity{

    public AngryPakia(int x, int y) {
        super(x, y);
        this.xVel = 0;
        this.yVel = 0;
        this.height = 50;
        this.width = 50;
        this.image = Resources.angryPakia;
        this.isLimitExceed = false;
        this.sound = Resources.jump2;

    }

    public void collide(Entity  e){
        e.yVel = 200;

    }

}
