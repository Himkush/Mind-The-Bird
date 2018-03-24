package himanshu.in.Screen;

import himanshu.in.Entities.Cloud;
import himanshu.in.Entities.PappuStill;
import himanshu.in.main.Game;
import himanshu.in.main.GamePanel;
import himanshu.in.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class StillScreen extends Screen {

    private List<Cloud> clouds = new ArrayList<>();

    public StillScreen(GamePanel p) {
        super(p);
        this.gpanel.score = 0;
        this.clouds.add(new Cloud(0, 0));
        this.clouds.add(new Cloud(1000, 0));
        this.entities.addAll(clouds);
        this.entities.add( new PappuStill(this.pappuX,this.pappuY-2));


    }

    public void draw(Graphics g) {
        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        super.draw(g);
        g.drawImage(Resources.backTree, 0,0, null);
        g.drawImage(Resources.frontTree, 100,0, null);

        g.drawImage(Resources.log, this.logX, this.logY,null);
        g.drawImage(Resources.ground, 0, 0, null);
        g.drawImage(Resources.grass, 0, 0, null);
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
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_ENTER){
            this.gpanel.currentScreen = new Stage1Screen(this.gpanel);
        }
    }
}
