package kg.itacademy.fv21;

import kg.itacademy.fv21.bread.Bread;

public class Main {
    public static void main(String[] args) {
        Bread br1 = new Bread(300, 200);
        Bread br2 = new Bread(250, 200);

        System.out.println(br1);
        System.out.println(br2);
    }
}
