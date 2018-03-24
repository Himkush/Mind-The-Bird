package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class Log extends Entity {


    public Log(int x, int y) {
        super(x, y);
        this.height = 71;
        this.width = 119;
        this.xVel = -8;
        this.image = Resources.log;
    }
}
