package Recursion;
public class Recursion {
    public static void main(String[] args) {
        int num= 5;
        int res= factorial(num);
        System.out.println(res);
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
