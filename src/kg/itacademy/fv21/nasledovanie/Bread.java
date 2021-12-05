package kg.itacademy.fv21.nasledovanie;

public class Bread {
    /**
     * Замените слово public на private,
     * для того чтобы применить принцип инкапсуляции,
     * который гласит, что мы должны ограничить доступ
     * к внутренней реализации объекта.
     */
    public double weight;
    public double price;
    public String producerCompany;

    public void bake() {
        System.out.println("Хлеб готов!");
    }

    public void pack() {
        System.out.println("Хлеб упакован");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }
}
