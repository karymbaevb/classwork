package kg.itacademy.fv21.encapsulation.gettersetter;

public class Main {
    public static void main(String[] args) {
        Squ squ = new Squ();
        squ.setSide(5.2);
        squ.setColor("Желтый");
        System.out.println(squ.getColor() + squ.calculate());

        Squ squRed = new Squ();
        squRed.setColor("Красный");
        squRed.setSide(4);
        System.out.println(squRed.getColor() + squRed.calculate());
    }
}
