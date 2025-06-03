package employee;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int registrationNumber;
        double hoursWorked, salary;

        do {
            System.out.print("Enter the registration number (999 to exit): ");
            registrationNumber = input.nextInt();

            if (registrationNumber == 999) {
                break;
            }

            if (registrationNumber >= 1000 && registrationNumber <= 1999) {
                System.out.print("Enter the hours worked: ");
                hoursWorked = input.nextDouble();
                salary = hoursWorked * 15;
                System.out.println("Salary: $ " + salary);
            } else {
                System.out.println("Invalid registration number!");
            }

            System.out.println(); // blank line for readability
        } while (true);

        System.out.println("End of the program.");
        input.close();
    }
}
