package productprofit;

import java.util.Scanner;

public class productprofit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the cost price?");
        double costPrice = input.nextDouble();

        System.out.println("What is the profit percentage?");
        double profitPercentage = input.nextDouble();

        double profitAmount = (costPrice * profitPercentage) / 100;
        double sellingPriceCash = costPrice + profitAmount;
        double sellingPriceInstallments = sellingPriceCash * 1.05;
        double cashTax = sellingPriceCash * 0.17;

        System.out.printf("Profit Amount: %.2f%n", profitAmount);
        System.out.printf("Cash Selling Price: %.2f%n", sellingPriceCash);
        System.out.printf("Installments Selling Price: %.2f%n", sellingPriceInstallments);
        System.out.printf("Cash Tax: %.2f%n", cashTax);

        input.close();
    }
}
