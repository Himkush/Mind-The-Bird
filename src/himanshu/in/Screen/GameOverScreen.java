package himanshu.in.Screen;

import himanshu.in.Entities.Cloud;
import himanshu.in.main.Game;
import himanshu.in.main.GamePanel;
import himanshu.in.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameOverScreen extends Screen{
    private List<Cloud> clouds = new ArrayList<>();

    public GameOverScreen(GamePanel p) {
        super(p);
        Resources.music.stop();
        this.clouds.add(new Cloud(0, 0));
        this.clouds.add(new Cloud(1000, 0));
        this.entities.addAll(clouds);
        Resources.jump1.play();
    }

    public void draw(Graphics g) {
        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        super.draw(g);
        g.drawImage(Resources.backTree, 0,0, null);
        g.drawImage(Resources.frontTree, 0,0, null);
        g.drawImage(Resources.stand,this.standX,this.standY,null);
        g.drawImage(Resources.planktop,this.plankTopX,this.plankTopY,null);
        g.drawImage(Resources.controls,345,250,null);

        g.drawImage(Resources.ground, 0, 0, null);
        g.drawImage(Resources.grass, 0, 0, null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, this.fontSize));
        g.drawString("Score : "+this.gpanel.score, this.wordStartingX, this.wordStartingY);
        g.drawString("Restart",750,250);
        g.setColor(new Color(207,67,13));
        g.setFont(new Font("Monospaced", Font.BOLD, 25));
        g.drawString(""+this.gpanel.score ,15,25);


    }
    @Override
    public void update() {
        super.update();
        for (Cloud c : clouds) {
            if (c.x <= -1000) {
                c.x = 1000;
            }
        }
    }

    @Override
    public void onMousePress(int xCord, int yCord) {
        if((this.plankTopX<xCord && xCord<this.plankTopX+200)&&(this.plankTopY<yCord && yCord<this.plankTopY+130) ){
            this.gpanel.currentScreen = new StillScreen(this.gpanel);
        }
    }
}
