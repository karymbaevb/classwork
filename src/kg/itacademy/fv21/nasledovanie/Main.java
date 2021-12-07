package kg.itacademy.fv21.nasledovanie;

public class Main {
    public static void main(String[] args) {
        Lepeshka lepeshka = new Lepeshka(50);
        lepeshka.setRadius(12);
        lepeshka.setPrice(22);
        lepeshka.setWeight(120);
        lepeshka.setProducerCompany("Murat");

        lepeshka.draw();
        lepeshka.bake();
        lepeshka.lakir();
        lepeshka.pack();
    }
}
