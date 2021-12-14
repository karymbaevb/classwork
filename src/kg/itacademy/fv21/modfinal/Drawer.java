package kg.itacademy.fv21.modfinal;

import java.awt.*;

public class Drawer extends Canvas {

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(12, 100, 50, 50);
    }
}
