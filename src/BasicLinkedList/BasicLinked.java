package BasicLinkedList;

import java.util.LinkedList;

public class BasicLinked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.addFirst("First Item");
        list.addLast("Last Item");
        list.remove("Banana");
        list.remove(1);
        System.out.println("Current List Items:");
        for (String fruit : list) {
            System.out.println("- " + fruit);
        }
    }
}
