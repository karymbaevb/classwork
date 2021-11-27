package kg.itacademy.fv21.inheritance;

public class EKopilkaNaslednik extends BaseKopilka {

    public void showMoneyInKopilka() {
        System.out.println("В копилке " + name + "cейчас денег: " + countMoney);
    }
}
