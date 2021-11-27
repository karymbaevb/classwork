package kg.itacademy.fv21.encapsulation;

public class Main {
    public static void main(String[] args) {
        Kopilka myKop = new Kopilka();
        myKop.insertMoney(12);
//        myKop.countMoney -  мы не можем изменить значение этого поля countMoney т.к. он private в класса
        myKop.showMoneyInKopilka();
    }
}
