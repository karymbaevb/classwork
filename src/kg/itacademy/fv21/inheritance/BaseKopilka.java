package kg.itacademy.fv21.inheritance;

public class BaseKopilka {
    public String name;
    public int countMoney; //Приватное Свойство или поле

    public void insertMoney(int money) {//Начало метода
        countMoney = countMoney + money;
    }//Конец метода
}
