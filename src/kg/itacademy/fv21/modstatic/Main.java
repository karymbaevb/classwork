package kg.itacademy.fv21.modstatic;

import kg.itacademy.fv21.modstatic.bread.Bread;
import kg.itacademy.fv21.modstatic.hidden.Child;

public class Main {
    public static void main(String[] args) {
        /**
         * у каждого нового объекта данного класса будет своё
         * значение этой переменной, меняя которое мы меняем его исключительно в одном объекте
         */
        Bread br1 = new Bread(300, 200);
        System.out.println("br1: " + br1);
        br1.bake();


        Bread br2 = new Bread(250, 200);
        System.out.println("br2: " + br2);
        br2.bake();
    }
}
