package kg.itacademy.fv21.Figure;

public class Figure {

    public String color;
    public LocationOfFigure locationOfFigure;
    public boolean isVisible;// виден/не виден

    public String speak() {//просмотреть в презентации наименование метода
        return "FIGURE";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocationOfFigure getLocationOfFigure() {
        return locationOfFigure;
    }

    public void setLocationOfFigure(LocationOfFigure locationOfFigure) {
        this.locationOfFigure = locationOfFigure;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
