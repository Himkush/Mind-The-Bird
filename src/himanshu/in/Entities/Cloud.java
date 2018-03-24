package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class Cloud extends Entity {

    public Cloud(int x, int y) {
        super(x, y);
        this.height = 500;
        this.width = 1000;
        this.xVel = -5;
        this.image = Resources.clouds;
    }
}
