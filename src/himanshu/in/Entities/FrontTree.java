package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class FrontTree extends Entity {
    public FrontTree(int x, int y) {
        super(x, y);
        this.height = 500;
        this.width = 1000;
        this.xVel = -8;
        this.image = Resources.frontTree;

    }
}
