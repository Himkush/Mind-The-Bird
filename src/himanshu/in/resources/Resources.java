package himanshu.in.resources;

import javax.imageio.ImageIO;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.*;

public class Resources {

    public static Image pappu1;
    public static Image pappu2;
    public static Image pappu3;
    public static Image pappu4;
    public static Image pappu5;
    public static Image pappu6;
    public static Image pappu7;
    public static Image pappu8;
    public static Image pappuPower;


    public static Image clouds;
    public static Image ground;
    public static Image grass;
    public static Image log;
    public static Image stand;
    public static Image planktop;
    public static Image controls;

    public static Image frontTree;
    public static Image backTree;

    public static Image happyPakia;
    public static Image sadPakia;
    public static Image angryPakia;

    public static Image branch;
    public static Image forkHandleBottom;
    public static Image forkHandleTop;

    public static Image redCoin;
    public static Image yellowCoin;
    public static Image star;

    public static Image berries;

    public static Color skyColor;

    public static Image mute;
    public static Image notmute;



    public static AudioClip music;
    public static AudioClip flap;
    public static AudioClip jump1;
    public static AudioClip jump2;
    public static AudioClip jump3;
    public static AudioClip ting;



    public static void load() {
        skyColor = new Color(103, 194, 255);


        try {
            pappu1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu1.png"));
            pappu2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu2.png"));
            pappu3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu3.png"));
            pappu4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu4.png"));
            pappu5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu5.png"));
            pappu6 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu6.png"));
            pappu7 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu7.png"));
            pappu8 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu8.png"));
            pappuPower = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/pappu6_power_up.png"));

            clouds = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/clouds.png"));
            ground = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/ground.png"));
            grass = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/grass.png"));
            log = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/log.png"));
            stand = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/stand.png"));
            planktop = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/plank_top.png"));
            controls = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/controls.png"));

            frontTree = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/front_trees.png"));
            backTree = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/back_trees.png"));

            angryPakia = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/angry_pakia.png"));
            sadPakia = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/sad_pakia.png"));
            happyPakia = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/happy_pakia.png"));

            branch = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/branch.png"));
            forkHandleTop = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/fork_head_bottom.png"));
            forkHandleBottom = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/fork_head_top.png"));

            redCoin = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/red_coin.png"));
            yellowCoin = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/yellow_coin.png"));

            star = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/star.png"));
            berries = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/berries.png"));

            music = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/music.wav"));
            flap = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/flap.wav"));
            jump1 = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/jump1.wav"));
            jump2 = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/jump2.wav"));
            jump3 = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/jump3.wav"));
            ting = Applet.newAudioClip(Resources.class.getClassLoader().getResource("himanshu/in/resources/audio/ting.wav"));

            notmute = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/mute_false.png"));
            mute = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("himanshu/in/resources/images/mute_true.png"));


        } catch (IOException e) {


        }
    }


}
