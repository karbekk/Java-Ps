package collections;

/**
 * Created by kartik on 10/15/16.
 */
public class Product {

    private String name;
    private int weight;


    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
