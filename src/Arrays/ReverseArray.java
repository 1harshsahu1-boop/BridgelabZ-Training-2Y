package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int a = 0;

        for(int b = arr.length - 1; a < b; --b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            ++a;
        }

    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        System.out.println("Reversed Array:");
        display(arr);
    }
}
