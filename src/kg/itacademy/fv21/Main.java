package kg.itacademy.fv21;

import kg.itacademy.fv21.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("FIO 1");
        student.setAge(13);
        student.setMark(5);

        Student student2 = new Student();
        student2.setFio("FIO2");
        student2.setAge(13);
        student2.setMark(3);

        Student student3 = new Student();
        student3.setFio("FIO3");
        student3.setAge(13);
        student3.setMark(2);

        Student[] studentList = {student, student2, student3};

        int sum = 0;

        for (int i = 0; i < studentList.length; i++) {
            sum = sum + studentList[i].getMark();
        }

        System.out.println(sum / studentList.length);
    }
}
