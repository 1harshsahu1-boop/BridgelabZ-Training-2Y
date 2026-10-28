package Arrays;

import java.util.Scanner;

public class SminElement {
    public static int secondMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = secondMinimum(arr);
        if (result != Integer.MAX_VALUE) {
            System.out.println("Second minimum element = " + result);
        }

    }
}
