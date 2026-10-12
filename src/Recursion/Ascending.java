package Recursion;
public class Ascending {
    public static void print(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int number = 5;
        print(number);
    }
}
