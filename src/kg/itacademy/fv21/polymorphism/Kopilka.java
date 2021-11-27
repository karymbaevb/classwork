package kg.itacademy.fv21.polymorphism;

public class Kopilka extends BaseKopilka {
    //1 способ применить принцип полиморфизма - написать 2 метода с одинаковым названием но с разными параметрами
    //По английски называется overload
    public void insertMoney(int money) {
        countMoney = countMoney + money;
    }

    public void insertMoney(double money) {
        countMoney = countMoney + money;
    }


    //2 способ применить принцип полиморфизма - написать в дочернем точно такой же метод, но внутри своя реализация
    //По английски называется override
    public void showMoneyInKopilka() {
        System.out.println("Метод был вызван из дочерней копилки: " + countMoney); //Своя реализация
    }
}
