package himanshu.in.Screen;

import himanshu.in.Entities.Entity;
import himanshu.in.main.GamePanel;
import himanshu.in.resources.Resources;

import java.awt.*;
import java.util.ArrayList;

abstract public class Screen {

    protected GamePanel gpanel;
    protected java.util.List<Entity> entities = new ArrayList<>();
    protected int wordStartingX = 345;
    protected int wordStartingY = 100;
    protected int logX = 60;
    protected int logY = 341;
    protected int standX = 800;
    protected int standY = 155;
    protected int plankTopX = 730;
    protected int plankTopY = 200;
    protected final int fontSize = 50;
    protected int pappuX =60;
    protected int pappuY = 295;
    public boolean isStart = false;
    public int muteX = 940;
    public int muteY = 20;
    public Image mute = Resources.notmute;


    public Screen(GamePanel p){

        super();
        this.gpanel = p;


    }

    public void update(){
        for(Entity e :this.entities){
            e.update();
        }
        if(!this.gpanel.isMute){
            this.mute = Resources.notmute;
        }
        else{
            this.mute = Resources.mute;
            Resources.music.stop();
        }
    }
    public void draw(Graphics g) {
        for(Entity e: entities) {
            if(e.isVisible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }
    }
    public void onMousePress(int xCord, int yCord) {
        if((this.muteX < xCord && xCord<this.muteX+51)&&(this.muteY<yCord && yCord<this.muteY+51) ){
            this.gpanel.isMute=!this.gpanel.isMute;

        }
    }

    public void onKeyPress(int keyCode) {

    }



}
