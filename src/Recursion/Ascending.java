package Recursion;
public class Ascending {
    // Your recursive method
    public static void print(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        }
        print(n - 1); // Recursive call
        System.out.print(n + " "); // Prints after the recursive call unwinds
    }
    // Added main method so IntelliJ can execute the program
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Printing numbers up to " + number + ":");
        print(number);
    }
}
