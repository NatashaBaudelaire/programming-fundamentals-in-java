package bmibodymassindex;

import java.util.Scanner;

public class bmibodymassindex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (meters): ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", BMI);

        input.close();
    }
}
