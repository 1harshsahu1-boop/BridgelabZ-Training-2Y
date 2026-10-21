package Recursion;
public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 78, 23, 56, 99, 34};
        int max = findMax(numbers, 0);
        int sum = findSum(numbers, 0);
        System.out.println(max);
        System.out.println(sum);
    }
    public static int findSum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + findSum(arr, index + 1);
    }
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int maxInRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxInRest);
    }
}

