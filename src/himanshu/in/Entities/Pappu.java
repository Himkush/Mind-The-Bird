package himanshu.in.Entities;

import himanshu.in.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pappu extends Entity {

    private List<Image> pappuImage =new ArrayList<>();
    public boolean pappuUp = false;
    public int pappuIndex = 0;

    public Pappu(int x, int y) {
        super(x, y);
        this.height = 40;
        this.width = 40;
        this.yVel = 8;
        pappuImage.add(Resources.pappu1);
        pappuImage.add(Resources.pappu2);
        pappuImage.add(Resources.pappu3);
        pappuImage.add(Resources.pappu4);
        pappuImage.add(Resources.pappu5);
        pappuImage.add(Resources.pappu6);
        pappuImage.add(Resources.pappu7);
        pappuImage.add(Resources.pappu8);

    }

    @Override
    public void update() {
        super.update();
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {

        }
        if(!this.pappuUp){
            this.pappuIndex++;
            this.pappuIndex %= 8;
            this.image = this.pappuImage.get(this.pappuIndex);
            this.yVel = 0;
            this.pappuUp =true;

        }
        else{
            this.yVel = 8;
            this.image = Resources.pappu4;
        }
    }
}
