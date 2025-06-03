package odometer;
import java.util.Scanner;

public class odometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial odometer value (km): ");
        int initial = input.nextInt();

        System.out.print("Enter the final odometer value (km): ");
        int finalPos = input.nextInt();

        if (finalPos < initial) {
            System.out.println("Error: The final odometer value cannot be less than the initial value.");
            input.close();
            return;
        }

        System.out.print("Enter the time traveled in minutes: ");
        int traveledMinutes = input.nextInt();

        if (traveledMinutes <= 0) {
            System.out.println("Error: Time traveled must be greater than zero.");
            input.close();
            return;
        }

        double distanceTraveled = finalPos - initial;
        double hoursTraveled = traveledMinutes / 60.0;
        double averageSpeed = distanceTraveled / hoursTraveled;

        System.out.printf("Distance Traveled: %.2f km%n", distanceTraveled);
        System.out.printf("Time Traveled: %.2f hours%n", hoursTraveled);
        System.out.printf("The average speed of the car was %.2f km/h%n", averageSpeed);

        input.close();
    }
}
