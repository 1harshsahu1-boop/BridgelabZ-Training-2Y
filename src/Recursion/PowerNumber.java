package Recursion;

public class PowerNumber {
    public static long powerStandard(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * powerStandard(base, exp - 1);
    }
    public static long powerOptimized(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        long halfPower = powerOptimized(base, exp / 2);
        if (exp % 2 == 0) {
            return halfPower * halfPower;
        }
        else {
            return base * halfPower * halfPower;
        }
    }
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        long result1 = powerStandard(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result1);
        long result2 = powerOptimized(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result2);
    }
}

