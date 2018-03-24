package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class ForkTop extends Entity {

    public ForkTop(int x, int y) {
        super(x, y);
        this.height = 371;
        this.width = 33;
        this.xVel = -8;
        this.image = Resources.forkHandleTop;

    }

}
