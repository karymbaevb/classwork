package kg.itacademy.fv21.encapsulation.gettersetter;

public class Rectangle {
    public int length;
    public int width;

    public int calculteSquare() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int inputLength) {
        if (inputLength < 0) {
            length = 0;
        }else{
            length = inputLength;
        }
    }

    public void setWidth(int inputWidth) {
        width = inputWidth;
    }

}
