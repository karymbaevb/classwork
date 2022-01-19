package kg.itacademy.fv21;

public class Main {
    public static void main(String[] args) {
//        Figure f = new Figure();
//        f.calculateP();

        Triangle tr = new Triangle();
        tr.calculateP();
        tr.showInfo();

        Rectangle rect = new Rectangle();
        rect.calculateP();

        Circle circle = new Circle();
        circle.calculateP();
    }
}
abstract class GrandFigure{

}

abstract class Figure extends GrandFigure{
    private String nameClass = "Figure";
    public Figure(){}
    abstract void calculateP();

    void showInfo(){
        System.out.println(nameClass);
    }
}

class Triangle extends Figure{
    @Override
    void calculateP(){
        System.out.println("calculate P Triangle");
    }
}

class Rectangle extends Figure{
    @Override
    void calculateP(){
        System.out.println("calculate P Rectangle");
    }
}

class Circle extends Figure{
    @Override
    void calculateP(){
        System.out.println("calculate P Circle");
    }
}



