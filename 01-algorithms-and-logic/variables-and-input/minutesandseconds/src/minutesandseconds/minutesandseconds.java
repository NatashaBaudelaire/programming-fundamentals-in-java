package minutesandseconds;
import java.util.Scanner;

public class minutesandseconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();

        if (hours < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int minutes = hours * 60;
            int seconds = hours * 3600;
            System.out.println(hours + " hours is equivalent to " + minutes + " minutes and " + seconds + " seconds.");
        }
        
        input.close();
    }
}
