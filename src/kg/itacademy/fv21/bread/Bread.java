package kg.itacademy.fv21.bread;

/**
 * Посмотрите на модификаторы класса
 * и исправьте там где это неправильно
 */
public class Bread {
    public int cost; //цена
    int weight; //вес

    private Bread(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    private int getCost() {
        return cost;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    protected int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
