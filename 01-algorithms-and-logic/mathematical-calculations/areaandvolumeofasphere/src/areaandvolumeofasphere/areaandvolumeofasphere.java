package areaandvolumeofasphere;

import java.util.Scanner;

public class areaandvolumeofasphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();


        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double area = 4 * Math.PI * Math.pow(radius, 2);


        System.out.printf("Volume of the sphere: %.2f%n", volume);
        System.out.printf("Surface area of the sphere: %.2f%n", area);

        input.close();
    }
}
