package kg.itacademy.fv21.introduceOOP;

public class Main {

    public static void main(String[] args) {
        //2 виде типов данных примитивные и ссылочные
        Kopilka myKopilka = new Kopilka();
        myKopilka.insertMoney(12);
        myKopilka.insertMoney(13);


        System.out.println(myKopilka.countMoney);
    }
}
