package Lessons1;

import Lessons1.MainCircles;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomListener implements MouseListener {

    MainCircles controller;

    CustomListener(MainCircles controller) {
        this.controller = controller;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
       //Нажатие кнопки
        if (e.getButton()==1){
            int i = controller.sprites.length;
            controller.sprites = new Sprite[i+1];
            for (i = 0; i < controller.sprites.length; i++) {
                controller.sprites[i] = new Ball();
            }
        }else if(e.getButton()==3 && controller.sprites.length !=0 ){

            int i = controller.sprites.length;
            controller.sprites = new Sprite[i-1];
            for (i = 0; i < controller.sprites.length; i++) {
                controller.sprites[i] = new Ball();
            }
        }else{

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Сдвиг мышки
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

