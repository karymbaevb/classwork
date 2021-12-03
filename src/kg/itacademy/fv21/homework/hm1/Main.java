package kg.itacademy.fv21.homework.hm1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 22;
        student1.name = "Роберт";
        student1.isWoman = false;

        Student student2 = new Student();
        student2.age = 21;
        student2.name = "Вика";
        student2.isWoman = true;

        Student student3 = new Student();

        System.out.printf("Name %s age %d isWoman %s", student1.name, student1.age, student1.isWoman);
        System.out.println();
        System.out.printf("Name %s age %d isWoman %s", student2.name, student2.age, student2.isWoman);
        System.out.println();
        System.out.printf("Name %s age %d isWoman %s", student3.name, student3.age, student3.isWoman);
        System.out.println();
    }
}
