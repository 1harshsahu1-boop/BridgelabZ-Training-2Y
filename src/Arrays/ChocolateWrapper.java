package Arrays;

import java.util.Scanner;

public class ChocolateWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Money: ");
        int money = sc.nextInt();
        int totalChocolates = Chocolates(money);
        System.out.println("Chocolates eaten: " + totalChocolates);
    }

    public static int Chocolates(int money) {
        int chocolatesEaten = money;

        int newChocolates;
        for(int wrappers = money; wrappers >= 3; wrappers = wrappers % 3 + newChocolates) {
            newChocolates = wrappers / 3;
            chocolatesEaten += newChocolates;
        }

        return chocolatesEaten;
    }
}
