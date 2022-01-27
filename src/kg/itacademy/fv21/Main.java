package kg.itacademy.fv21;

import kg.itacademy.fv21.aircraft.Aircraft;
import kg.itacademy.fv21.aircraft.Boing;
import kg.itacademy.fv21.aircraft.Tu;

/**
 * Нужно один раз вывести “Hello! I'm learning Java, Java”. Что нужно вставить вместо X, Y, Z чтобы получить соответствующий вывод.
 */
public class Main {
    public static void main(String[] args) {
//        try {
//            subroutine();
//        } catch (ArithmeticException ex) {
//            System.out.println("А я знаю как");
//        }
        Cat[] cats = {
                new Cat("Tom"),
                null,
                new Cat("Sam")
        };

        for (int i = 0; i < cats.length + 10; i++) {
            try {
                if(cats[i] == null){
                    throw new CatNotFoundException("Hello world. Cat is lost");
                }
                System.out.println(i + " " + cats[i].name);
            } catch (CatNotFoundException ex) {
                System.out.println(i + ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Массив закончен");
                break;
            } catch (RuntimeException ex) {
                System.out.println("Так нельзя");
            }
            finally {
                System.out.println(" А я выполнюсь в любом случае");
            }
        }
    }

    static void subroutine() throws ArithmeticException, NullPointerException, IndexOutOfBoundsException {

        try {
            int d = 0;
            int a = 10 / d;
        } catch (Exception ex) {
            throw ex;
        }

    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
}
