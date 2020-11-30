package Lessons1;

import java.awt.*;

public class BackGround {

    Color color = new Color (
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    public void onSetBackGround(GameCanvas canvas) {

       canvas.setBackground(color);

    }

}
