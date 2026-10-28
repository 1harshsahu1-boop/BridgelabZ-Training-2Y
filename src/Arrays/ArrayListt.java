package Arrays;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(5);
        list.add(4);
        list.add(3);
        int[] arr = new int[list.size()];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (Integer)list.get(i);
            System.out.println(arr[i]);
        }

    }
}
