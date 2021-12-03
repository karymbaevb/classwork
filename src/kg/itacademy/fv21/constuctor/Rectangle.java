package kg.itacademy.fv21.constuctor;

public class Rectangle {
    private int heigth;
    private int width;

    /**
     * Конструктор по умолчанию - без параметров
     */
    public Rectangle() {
    }

    public Rectangle(int width, int heigth) {
      this.width = width;
      this.heigth = heigth;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeigth() {
        return this.heigth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int h) {
        heigth = h;
        this.getHeigth();
    }
}
