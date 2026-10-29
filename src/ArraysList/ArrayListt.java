package ArraysList;
import java.util.ArrayList;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);
        String firstFruit = fruits.get(0);

        System.out.println("First fruit: " + firstFruit);
        fruits.set(1, "Mango");

        System.out.println("After update: " + fruits);
        fruits.remove(2);

        System.out.println("After removal: " + fruits);
        System.out.println("List size: " + fruits.size());
    }
}

