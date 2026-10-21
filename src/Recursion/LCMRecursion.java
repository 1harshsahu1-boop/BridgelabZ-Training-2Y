package Recursion;
public class LCMRecursion {
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a * b) / findGCD(a, b);
    }
    public static int findHCF(int a, int b) {
        if (b == 0) return a;
        return findHCF(b, a % b);
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int lcm = findLCM(num1, num2);
        int gcd = findGCD(num1, num2);
        int hcf = findHCF(num1, num2);
        System.out.println(gcd);
        System.out.println(lcm);
        System.out.println(hcf);
    }
}
