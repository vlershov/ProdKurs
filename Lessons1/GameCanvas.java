package Lessons1;

import Lessons1.MainCircles;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameCanvas extends JPanel {

    Random rnd = new Random();

    long lastFrameTime;
    MainCircles controller;
    BackGround backGround = new BackGround();

    GameCanvas(MainCircles controller) {
        lastFrameTime = System.nanoTime();
        this.controller = controller;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        controller.onDrawFrame(this, g, deltaTime);
        backGround.onSetBackGround(this);

        try {
            Thread.sleep(17); // ~60 fps

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
