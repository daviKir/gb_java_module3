package fruitTask;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> fruits = new ArrayList<>();

    public void clearBox() {
        this.fruits.clear();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void add(T fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }

        double weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }

        return weight;
    }

    public <F extends Fruit> boolean compare(Box<F> box) {
        return this.getWeight() == box.getWeight();
    }

    public void sprinkle(Box<T> box) {
        this.fruits.addAll(box.getFruits());
        box.clearBox();
    }
}
