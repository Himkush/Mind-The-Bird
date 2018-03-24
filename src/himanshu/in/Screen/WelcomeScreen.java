package himanshu.in.Screen;

import himanshu.in.Entities.Entity;
import himanshu.in.Entities.Pappu;
import himanshu.in.Entities.PappuStill;
import himanshu.in.main.Game;
import himanshu.in.main.GamePanel;
import himanshu.in.resources.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen{



    public WelcomeScreen(GamePanel p) {
        super(p);
        this.entities.add( new PappuStill(this.pappuX,this.pappuY-2));
    }


    @Override
    public void update() {
        super.update();
    }

    public void draw(Graphics g){

        g.setColor(Resources.skyColor);
        g.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);
        super.draw(g);
        g.drawImage(Resources.stand,this.standX,this.standY,null);
        g.drawImage(Resources.planktop,this.plankTopX,this.plankTopY,null);
        g.drawImage(Resources.log, this.logX, this.logY,null);
        g.drawImage(Resources.ground,0,0,null);
        g.drawImage(Resources.grass,0,0,null);
//
//        g.drawImage(Resources.pappu1,this.pappuX,this.pappuY,null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, this.fontSize));
        g.drawString("MIND THE", this.wordStartingX, this.wordStartingY);
        g.drawString("BIRD", this.wordStartingX + 55, this.wordStartingY +55);
        g.setColor(Color.BLACK);
        g.drawString("By Himanshu", this.wordStartingX, this.wordStartingY+2*55);
        g.drawImage(Resources.controls,345,250,null);
        g.setColor(Color.WHITE);
        g.drawString("Start",750,250);

    }

    @Override
    public void onMousePress(int xCord, int yCord) {
        if((this.plankTopX<xCord && xCord<this.plankTopX+200)&&(this.plankTopY<yCord && yCord<this.plankTopY+130) ){
            this.gpanel.currentScreen = new StillScreen(this.gpanel);
        }

    }
}
