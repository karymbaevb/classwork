package kg.itacademy.fv21.toString;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(123, "USA", "Matrica");
        Computer computer = new Computer(display);
        computer.setColor("Red");
        computer.setMarka("Lenovo");
        System.out.println(display);
        System.out.println("----------------------");
        System.out.println(computer);
    }
}
