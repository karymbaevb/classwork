package kg.itacademy.fv21.modstatic.bread;

public class Bread {
    public static int cost; //цена
    private int weight; //вес

    public Bread() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void bake(){
        System.out.println("Испекли хлеб весом " + weight);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
