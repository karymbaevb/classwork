package kg.itacademy.fv21;

public class Main {
    public static void main(String[] args) {
        Writable black = new BlackBoard();
        black.write();
//        black.value = 123;
    }
}
interface Otherable{
    public static final int value = 100;
}
abstract interface Writable extends Otherable{
    public abstract void write();
}

abstract class AbstractBoard implements Writable{
    abstract void showInfo();
}



class WhiteBoard extends AbstractBoard {
    Cell cell;
    @Override
    void showInfo(){
        System.out.println("I m white");
    }

    @Override
    public void write() {
        System.out.println("I write by white marker");
    }
}

class BlackBoard extends AbstractBoard {
    public String name;
    @Override
    void showInfo(){
        System.out.println("I m black");
    }

    @Override
    public void write() {
        System.out.println("Write by black marker");
    }
}

class Cell{
    String name;
}
