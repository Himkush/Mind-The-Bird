package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class ForkBotttom extends Entity {
    public ForkBotttom(int x, int y) {
        super(x, y);
        this.height = 371;
        this.width = 33;
        this.xVel = -8;
        this.image = Resources.forkHandleBottom;

    }
}
