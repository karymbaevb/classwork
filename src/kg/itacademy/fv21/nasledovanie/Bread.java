package kg.itacademy.fv21.nasledovanie;

public class Bread {

    private double weight;
    private double price;
    private String producerCompany;

    public Bread(double w){
        this.weight = w;
    }

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
