package himanshu.in.Screen;

import himanshu.in.Entities.*;
import himanshu.in.main.Game;
import himanshu.in.main.GamePanel;
import himanshu.in.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stage1Screen extends Screen {

    private List<Cloud> clouds = new ArrayList<>();
    private List<FrontTree> frontTree = new ArrayList<>();
    private List<BackTree> backTree = new ArrayList<>();
    private List<Ground> ground = new ArrayList<>();
    private List<Grass> grass = new ArrayList<>();
    private List<Entity> blocks = new ArrayList<>();

    private List<Entity> pakia = new ArrayList<>();
    private List<Entity> gems = new ArrayList<>();
    private List<Entity> coins = new ArrayList<>();

    private Pappu pappu;
    private Log log;

    private Random rand = new Random();
    private int random ;
    private int pakiaRandom;
    private int random2;
    private int gemsRandom;
    private int coinRandom;


    private HappyPakia happy;
    private SadPakia sad;
    private AngryPakia angry;
    private long start;


    public Stage1Screen(GamePanel p) {
        super(p);
        Resources.music.loop();


        this.gpanel.score = 0;
        this.clouds.add(new Cloud(0, 0));
        this.clouds.add(new Cloud(1000, 0));

        this.backTree.add(new BackTree(0, 0));
        this.backTree.add(new BackTree(1000, 0));

        this.frontTree.add(new FrontTree(100, 0));
        this.frontTree.add(new FrontTree(1100, 0));
        this.ground.add(new Ground(0,0));
        this.ground.add(new Ground(1000,0));

        this.grass.add(new Grass(0,0));
        this.grass.add(new Grass(1000,0));
        this.log = new Log(this.logX,this.logY);

        this.blocks.add(new Branch(2*250,-250));
        this.blocks.add(new Branch(3*250,250));
        this.blocks.add(new ForkBotttom(4*250,300));
        this.blocks.add(new ForkTop(5*250,-150));
        this.blocks.add(new ForkTop(4*250,-250));
        this.blocks.add(new Branch(6*250, 400));
        this.blocks.add(new Branch(6*250,-400));
        this.blocks.add(new ForkTop(8*250,-250));
        this.blocks.add(new ForkBotttom(8*250,325));
        this.blocks.add(new ForkBotttom(10*250,350));
        this.blocks.add(new Branch(11*250,-350));
        this.blocks.add(new Branch(12*250,250));
        this.blocks.add(new ForkTop(13*250,-100));
        this.blocks.add(new ForkBotttom(14*250,330));
        this.blocks.add(new Branch(15*250,225));

        this.random = 100*(1+this.rand.nextInt(3));
        this.pappu = new Pappu(this.pappuX,this.pappuY);

        this.pakia.add(new SadPakia(500,550));
        this.pakia.add(new HappyPakia(500,550));
        this.pakia.add(new AngryPakia(500,550));

        this.pakiaRandom = rand.nextInt(this.pakia.size());

        this.gems.add(new Star(300,100));
        this.gems.add(new Berry(820, 200));
        this.gemsRandom = rand.nextInt(this.gems.size());

        this.coins.add(new RedCoin(550,100));
        this.coins.add(new YellowCoin(950,300));
        this.coinRandom = rand.nextInt(this.coins.size());


        this.entities.addAll(this.clouds);
        this.entities.addAll(this.backTree);
        this.entities.addAll(this.frontTree);
        this.entities.add(this.log);
        this.entities.addAll(this.ground);
        this.entities.addAll(this.grass);
        this.entities.addAll(this.blocks);
        this.entities.addAll(this.gems);
        this.entities.addAll(this.coins);
        this.entities.add(this.pappu);
        this.entities.addAll(this.pakia);


        this.pakia.get(pakiaRandom).xVel = -10;
        this.pakia.get(pakiaRandom).yVel = -10;

    }

    @Override
    public void update() {
        super.update();
        for (Cloud c : clouds) {
            if (c.x <= -1000) {
                c.x = 1000;
            }
        }
        for (FrontTree ft : frontTree) {
            if (ft.x <= -1000) {
                ft.x = 1000;
            }
        }

        for (BackTree bt : backTree) {
            if (bt.x <= -1000) {
                bt.x = 1000;
            }
        }
        for (Ground grd : ground) {
            if (grd.x <= -1000) {
                grd.x = 1000;
            }
        }

        for (Grass grs : grass) {
            if (grs.x <= -1000) {
                grs.x = 1000;
            }
        }

        if ((this.pappu.y <= -(0 + this.pappu.height)) || (pappu.y >= (Game.GAME_HEIGHT + this.pappu.height))){
            this.gpanel.currentScreen = new GameOverScreen(this.gpanel);
        }

        if(this.pakia.get(this.pakiaRandom).y <= this.random && !this.pakia.get(this.pakiaRandom).isLimitExceed ){
            this.pakia.get(this.pakiaRandom).yVel = 15;
            this.pakia.get(this.pakiaRandom).isLimitExceed = true;
        }

        if (this.pakia.get(this.pakiaRandom).x <= -70 || this.pakia.get(this.pakiaRandom).y<=-70){
            this.pakia.get(this.pakiaRandom).isVisible = true;
            this.random = 100*(1+rand.nextInt(3));
            this.pakiaRandom = rand.nextInt(this.pakia.size());
            this.random2 =  rand.nextInt(31);
            if (this.random2%3 != 0){
                this.pakia.get(this.pakiaRandom).isVisible  = false;
            }
            if (this.pakia.get(this.pakiaRandom).isVisible){
                this.pakia.get(this.pakiaRandom).sound.play();
            }
            this.pakia.get(this.pakiaRandom).xVel = -10;
            this.pakia.get(this.pakiaRandom).yVel = -10;
            this.pakia.get(this.pakiaRandom).x = 600;
            this.pakia.get(this.pakiaRandom).y = 550;
            this.pakia.get(this.pakiaRandom).isLimitExceed = false;

        }

        if (this.gems.get(this.gemsRandom).x <=-70 ){

            this.gems.get(this.gemsRandom).isVisible = true;
            this.gemsRandom  = rand.nextInt(this.gems.size());

            this.random2 = rand.nextInt(31);
            if (this.random2%3!= 0){
                this.gems.get(this.gemsRandom).isVisible = false;
            }
            this.gems.get(this.gemsRandom).x = 1000;
            this.gems.get(this.gemsRandom).y = 100*(2+this.rand.nextInt(2));
        }


        if (this.coins.get(this.coinRandom).x <= -70){
            this.coins.get(this.coinRandom).isVisible =  true;
            this.coinRandom = rand.nextInt(this.coins.size());
            this.random2 = rand.nextInt(31);
            if (this.random2%3!= 0){
                this.coins.get(this.coinRandom).isVisible = false;
            }
            this.coins.get(this.coinRandom).x = 1100;
            this.coins.get(this.coinRandom).y = 100*(2+this.rand.nextInt(2));

        }




        for (Entity e :this.blocks){


                if (e.x <= -3000) {
                   // e.y = 50 * y;
                    e.x = 1000;
                }

                if(e.isColliding(this.pappu)){
                   this.gpanel.currentScreen = new GameOverScreen(this.gpanel);
                }
        }
        if(this.pakia.get(this.pakiaRandom).isColliding(this.pappu)){
            this.pakia.get(this.pakiaRandom).collide(this.pappu);
        }

        if (this.gems.get(this.gemsRandom).isColliding(this.pappu)){
            this.gems.get(this.gemsRandom).collide(this.pappu);
            this.start = System.currentTimeMillis();
        }


        if (this.coins.get(this.coinRandom).isColliding(this.pappu)){
            this.gpanel.score += this.coins.get(this.coinRandom).addPoints();
        }

        //to check that pappu exceed from the screen

        if (this.pappu.x<-30){
            this.gpanel.currentScreen = new GameOverScreen(this.gpanel);
        }

        if (System.currentTimeMillis()-this.start>=9000){
            this.pappu.powerUp = false;
            this.start = 0;
        }

    }


    public void draw(Graphics g) {
        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        super.draw(g);
        g.setColor(new Color(207,67,13));
        g.setFont(new Font("Monospaced", Font.BOLD, 25));
        g.drawString(""+this.gpanel.score ,15,25);
        if (this.pappu.powerUp){
            g.setFont(new Font("Helvetica", Font.BOLD, 40));
            g.drawString("POWER UP",this.wordStartingX, this.wordStartingY);
        }
        else {
            Resources.skyColor = new Color(103, 194, 255);
        }

    }

    @Override
    public void onKeyPress(int keyCode) {
        if ((keyCode == KeyEvent.VK_UP) || (keyCode==KeyEvent.VK_ENTER)){
            this.pappu.y -= 10;
            this.gpanel.score += 1;
            Resources.flap.play();
            this.pappu.pappuUp = false;
        }
        else{
            this.pappu.pappuUp = true;
        }
        if ((keyCode == KeyEvent.VK_SPACE)){
            this.gpanel.currentScreen = new StillScreen(this.gpanel);
        }

        }

}

