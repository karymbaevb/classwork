package kg.itacademy.fv21.modfinal;

import java.awt.*;

public class Drawer extends Canvas {
    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillOval(50, 50, 100, 100);
    }
}
