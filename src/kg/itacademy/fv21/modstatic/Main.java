package kg.itacademy.fv21.modstatic;

import kg.itacademy.fv21.modstatic.bread.Bread;

public class Main {
    public static void main(String[] args) {
        /**
         * у каждого нового объекта данного класса будет своё
         * значение этой переменной, меняя которое мы меняем его исключительно в одном объекте
         */
        Bread br1 = new Bread();
        br1.cost = 15;
        br1.setWeight(249);
        br1.bake();

        Bread br2 = new Bread();
        br2.setWeight(252);
        br2.bake();

        Bread br3 = new Bread();
        br3.setWeight(250);
        br3.bake();

        Bread br4 = new Bread();

        System.out.println("br1: " + br1);
        System.out.println("br2: " + br2);
        System.out.println("br3: " + br3);
        System.out.println("br4: " + br4);
    }
}
