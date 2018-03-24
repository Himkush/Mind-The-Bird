package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class Branch extends Entity {

    public Branch(int x, int y) {
        super(x, y);
        this.height = 500;
        this.width = 31;
        this.xVel = -8;
        this.image = Resources.branch;

    }

}
