package kg.itacademy.fv21.Figure;

public class Rectangle extends Figure {
public static int count = 0;
    public int height;
    int widht;

    public Rectangle(int side) {
        this.height = side;
        this.widht = side;
        count++;// предусмотреть подсчет количества
    }

    public Rectangle(int height, int widht) {
        this.height = height;
        this.widht = widht;
        count++;//
    }


    @Override
    public String speak() {// переопределить speak
        return "RECTANGLE";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }


}
