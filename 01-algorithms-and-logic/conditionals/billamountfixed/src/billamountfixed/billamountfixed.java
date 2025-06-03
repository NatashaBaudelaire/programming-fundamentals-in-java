package billamount;

import java.util.Scanner;

public class billamount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total bill amount:");
        double totalBillAmount = input.nextDouble();

        int numberOfAdultMen = 4;
        int numberOfAdultWomen = 3;
        int numberOfChildren = 5;
        int totalPeople = numberOfAdultMen + numberOfAdultWomen + numberOfChildren;

        double amountPerPerson = totalBillAmount / totalPeople;
        double amountForAdultMen = amountPerPerson * numberOfAdultMen;
        double amountForAdultWomen = amountPerPerson * numberOfAdultWomen;
        double amountForChildren = amountPerPerson * numberOfChildren;

        System.out.printf("Amount for Adult Men: $%.2f%n", amountForAdultMen);
        System.out.printf("Amount for Adult Women: $%.2f%n", amountForAdultWomen);
        System.out.printf("Amount for Children: $%.2f%n", amountForChildren);

        input.close();
    }
}
