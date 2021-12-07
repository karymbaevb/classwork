package kg.itacademy.fv21.nasledovanie;

public class Lepeshka extends Bread {
    private double radius;

    public Lepeshka(double weight){
        super(weight);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void lakir(){
        System.out.println("Лакировать");
    }
    public void draw(){
        System.out.println("Наносить узоры");
    }

    @Override
    public void pack(){
        System.out.println("Упаковать в экологичный пакет");
    }
}
