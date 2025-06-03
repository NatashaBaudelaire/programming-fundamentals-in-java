package Tests;

import java.util.Scanner;

public class DiabetesTests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tests test = new Tests();

        System.out.print("Enter the test identifier: ");
        test.idTest = input.nextInt();

        System.out.print("Enter glucose level (mg/dL): ");
        test.glucoseLevel = input.nextInt();

        System.out.println("\nTest ID: " + test.idTest);
        System.out.println("Glucose level: " + test.glucoseLevel + " mg/dL");

        String diagnosis = test.getDiagnosis();
        System.out.println("Diagnosis: " + diagnosis);

        input.close();
    }
}
