package kg.itacademy.fv21;

public class Main {
    public static void main(String[] args) {
        Swimmable[] okeanarium = {new Shark(), new Turtle(), new Duck()};
//        for (Swimmable element : okeanarium
//        ) {
//            element.swim();
//            Soundable sound = (Soundable)element;
//            sound.sound();
//        }

        Swimmable sharkSwim = okeanarium[0];
//        Shark shark = (Shark) sharkSwim;
//        System.out.println(shark.getClass());

        if(sharkSwim instanceof Shark){
            System.out.println("Shark");
        }else if(sharkSwim instanceof  Turtle){
            System.out.println("Turtle");
        }

    }
}

interface Swimmable {
    void swim();
}

interface Soundable {
    void sound();
}

class Turtle implements Swimmable, Soundable {

    @Override
    public void swim() {
        System.out.println("Turtle swim");
    }

    @Override
    public void sound() {
        System.out.println("Turtle sound");

    }
}

class Shark implements Swimmable, Soundable {

    @Override
    public void swim() {
        System.out.println("Shark swim");
    }

    @Override
    public void sound() {
        System.out.println("Shark sound");

    }
}

class Duck implements Swimmable, Soundable {

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void sound() {
        System.out.println("Duck sound");

    }
}
