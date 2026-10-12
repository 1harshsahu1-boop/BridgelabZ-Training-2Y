package Recursion;
public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        // Call the recursive method
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
    // A simple recursive method to calculate factorial
    public static int factorial(int n) {
        // 1. Base Case: Stops the recursion from looping infinitely
        if (n <= 1) {
            return 1;
        }
        // 2. Recursive Case: The method calls itself
        return n * factorial(n - 1);
    }
}
