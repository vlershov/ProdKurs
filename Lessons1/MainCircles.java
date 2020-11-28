package Lessons1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MainCircles extends JFrame {
    //Начальная позиция
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    //Начальная позиция
    //Размер окна
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    //Размер окна
    //КОличество фигур
    Sprite[] sprites = new Sprite[10];

    //КОличество фигур
    public static void main(String[] args) {
        new MainCircles();
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");
        addMouseListener((MouseListener) new CustomListener(this));
        GameCanvas canvas = new GameCanvas(this);
        initApplication();
        add(canvas);
        setVisible(true);
    }

    private void initApplication() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
}
