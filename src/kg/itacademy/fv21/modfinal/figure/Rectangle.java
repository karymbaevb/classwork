package kg.itacademy.fv21.modfinal.figure;

public final class Rectangle extends Figure{
    public static int count = 0;
    private int w;
    private int h;

    public Rectangle(int side) {
        this.w = side;
        this.h = side;
        count++;
    }

    public Rectangle(int sideA, int sideB) {
        this.w = sideA;
        this.h = sideB;
        count++;
    }

    @Override
    public String speak(){
        return "Rectangle";
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
