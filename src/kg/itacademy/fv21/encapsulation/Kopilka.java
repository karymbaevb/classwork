package kg.itacademy.fv21.encapsulation;

public class Kopilka {//Начало класса
    private int countMoney; //private - именно так мы можем ограничить доступ к свойству

    public void insertMoney(int money) {//Начало метода
        countMoney = countMoney + money;
    }//Конец метода

    public void showMoneyInKopilka() {
        System.out.println("Сейчас денег в копилке: " + countMoney);
    }

}//Конец класса
