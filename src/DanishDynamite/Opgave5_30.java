package DanishDynamite;

import java.util.Scanner;

public class Opgave5_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the invested amount of money: ");
        double money = input.nextDouble();

        System.out.println("Enter the interest rate: ");
        double monthlyinterestRate = (input.nextDouble() / 100) / 12;

        System.out.println("Enter the amount of mouth for investment");
        int nMonth = input.nextInt();

        double monthlySum = 0;

        for (int i = 1; i <= nMonth; i++) {

            monthlySum = (money + monthlySum) * (1 + monthlyinterestRate);

            System.out.printf("Month %d Sum %.2f", i, monthlySum);
        }
    }
}
