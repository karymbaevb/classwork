package kg.itacademy.fv21;

/**
 * Нужно один раз вывести “Hello! I'm learning Java, Java”. Что нужно вставить вместо X, Y, Z чтобы получить соответствующий вывод.
 */
public class Main {
    public static void main(String[] args) {
//      example3();
        Human human = new Human();
        human.name = "фывафывад234о1дж234о1234";
        human.gender = Gender.WOMAN;
        System.out.println(human.gender.description);
    }


    static void example1() {
        Apple ар;
        ар = Apple.RedDel;
        System.out.println("Знaчeниe ар: " + ар);
        System.out.println();
        ар = Apple.GoldenDel;
        if (ар == Apple.GoldenDel) {
            System.out.println("Переменная ар содержит GoldenDel.\n");
        }
        switch (ар) {
            case Jonathan:
                System.out.println("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
        }
    }

    static void example2() {
        Apple allapples[] = Apple.values();
        for (Apple а : allapples){
            System.out.println(а);
        }
        System.out.println();
        Apple аp = Apple.valueOf("Winesap");
        Apple.GoldenDel.getPrice();
        System.out.println("Пepeмeннaя ар содержит " + аp);
    }

    static void example3(){
        Apple ар = Apple.GoldenDel;
        System.out.println("Яблoкo сорта Winesap стоит "
                + Apple2.Winesap.getPrice()
                + " центов. \n");

        System.out.println("Цeны на все сорта яблок:");
        for(Apple а : Apple.values())
            System.out.println(а + " стоит " + а.getPrice() + " центов. " );
    }

}

enum Apple{
    Jonathan(12),
    GoldenDel(13),
    RedDel(25),
    Winesap(100),
    Cortland(10);

    private int price;
    String desc;
    Apple(){
        this.price = 12;
        this.desc= "";
    }

    Apple(int price){
        this.price = price;
    }

    int getPrice(){
        return this.price;
    }
}

enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(16), Cortland(6);

    private int price;
    Apple2() { price = -1;}
    Apple2(int price){
        this.price = price;
    }

    int getPrice(){
        return this.price;
    }
}