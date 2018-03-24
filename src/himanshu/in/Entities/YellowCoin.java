package himanshu.in.Entities;

import himanshu.in.resources.Resources;

public class YellowCoin extends Entity{
    public YellowCoin(int x, int y) {
        super(x, y);
        this.height = 3;
        this.width = 38;
        this.xVel = -8;
        this.image = Resources.yellowCoin;
        this.isVisible =  false;

    }
    @Override
    public boolean isColliding(Entity other) {
        this.updateRect();
        other.updateRect();
        return  this.isVisible && other.isVisible && this.rect.intersects(other.rect);
    }

    @Override
    public int addPoints() {
        Resources.ting.play();
        this.isVisible = false;
        return 50;

    }
}
