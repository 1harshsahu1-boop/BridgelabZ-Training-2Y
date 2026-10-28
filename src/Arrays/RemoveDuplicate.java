package Arrays;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void removeDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        int k = 0;

        for(int i = 0; i < n; ++i) {
            boolean found = false;

            for(int j = 0; j < k; ++j) {
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k] = arr[i];
                ++k;
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < k; ++i) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr, n);
    }
}
