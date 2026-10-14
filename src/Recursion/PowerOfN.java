package Recursion;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double Power=Math.pow(x,n);
        System.out.println(Power);
    }
}
