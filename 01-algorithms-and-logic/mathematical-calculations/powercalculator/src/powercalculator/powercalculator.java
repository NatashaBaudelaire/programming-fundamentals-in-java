package powercalculator;

import java.util.Scanner;

public class powercalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Electric Power Calculator");

        System.out.print("Enter the voltage (in volts): ");
        double voltage = input.nextDouble();

        System.out.print("Enter the resistance (in ohms): ");
        double resistance = input.nextDouble();

        if (resistance <= 0) {
            System.out.println("Error: Resistance must be greater than zero.");
        } else {
            double power = (voltage * voltage) / resistance;
            System.out.printf("The electric power is %.2f watts.%n", power);
        }

        input.close();
    }
}
