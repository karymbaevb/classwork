package kg.itacademy.fv21.modstatic.bread;

public class Bread {
    private int cost; //цена
    private int weight; //вес
    public int count; //Количество созданных объектов

    public Bread(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
        count++;
    }

    public Bread() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void bake(){
        System.out.println("Испекли хлеб весом " + weight);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", count=" + count +
                '}';
    }
}
