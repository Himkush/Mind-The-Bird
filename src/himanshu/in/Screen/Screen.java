package himanshu.in.Screen;

import himanshu.in.Entities.Entity;
import himanshu.in.main.GamePanel;

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


    public Screen(GamePanel p){

        super();
        this.gpanel = p;

    }

    public void update(){
        for(Entity e :this.entities){
            e.update();
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

    }

    public void onKeyPress(int keyCode) {

    }



}
