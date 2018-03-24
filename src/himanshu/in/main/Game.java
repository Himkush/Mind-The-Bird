package himanshu.in.main;

import javax.swing.*;

public class Game {

    public static final int GAME_HEIGHT = 500;
    public static final int GAME_WIDTH = 1000;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Mind The Bird");
        GamePanel panel = new GamePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);



//        JFrame frame1 = new JFrame();
//        GamePanel panel1 = new GamePanel();
//        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
//        frame1.add(panel1);
//        frame1.pack();
//        frame1.setVisible(true);

    }

}
