import fruitTask.Apple;
import fruitTask.Box;
import fruitTask.Orange;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"1", "2", "3", "4"};

        ArrayHelpers.swap(intArr, 1, 2);

        ArrayList<Integer> intArrayList = ArrayHelpers.transformToArrayList(intArr);
        ArrayList<String> strArrayList = ArrayHelpers.transformToArrayList(strArr);


        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        System.out.println("Яблок в appleBox1: " + appleBox1.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        System.out.println("Апельсинов в orangeBox1: " + orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.add(new Orange());
        System.out.println("Апельсинов в orangeBox2: " + orangeBox2.getWeight());
        orangeBox1.sprinkle(orangeBox2);
        System.out.println("Пересыпаем аперьсины из orangeBox1 в orangeBox2");
        System.out.println("Апельсинов в orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Апельсинов в orangeBox2: " + orangeBox2.getWeight());

    }
}
