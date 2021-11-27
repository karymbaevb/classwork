package kg.itacademy.fv21.inheritance;

public class Main {
    public static void main(String[] args) {
        EKopilkaNaslednik kop = new EKopilkaNaslednik();
        kop.insertMoney(12);
        kop.name = "E-kopilka";
        kop.showMoneyInKopilka();

        OldKopilkaNaslednik old = new OldKopilkaNaslednik();
        old.insertMoney(12);
//        old.showMoneyInKopilka(); - этот метод не реализован в дочернем класса OldKopilkaNaslednik и не в родительском классе BaseKopilka. Поэтому он не будет работать

    }
}
