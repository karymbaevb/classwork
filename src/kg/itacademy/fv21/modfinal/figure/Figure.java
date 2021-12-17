package kg.itacademy.fv21.modfinal.figure;

import java.awt.*;

public class Figure {
    Location location;
    Color color;
    boolean isVisible;

    public String speak() {
        return location + color.toString() + isVisible;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
