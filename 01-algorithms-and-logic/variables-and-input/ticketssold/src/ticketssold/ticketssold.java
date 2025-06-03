package ticketssold;
import java.util.Scanner;

public class ticketssold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of tickets available for sale: ");
        int ticketsAvailable = input.nextInt();

        System.out.print("Enter the number of tickets remaining after the sale: ");
        int ticketsLeft = input.nextInt();

        if (ticketsLeft > ticketsAvailable) {
            System.out.println("Error: Tickets remaining cannot be more than tickets available.");
            input.close();
            return;
        }

        System.out.print("Enter the ticket price: ");
        double valueTicket = input.nextDouble();

        if (valueTicket < 0) {
            System.out.println("Error: Ticket price cannot be negative.");
            input.close();
            return;
        }

        int ticketsSold = ticketsAvailable - ticketsLeft;
        double totalRevenue = ticketsSold * valueTicket;
        
        System.out.println("Number of tickets sold: " + ticketsSold);
        System.out.printf("Revenue from ticket sales: R$ %.2f%n", totalRevenue);

        ticketsAvailable = ticketsLeft;  // Atualiza para o que sobrou

        System.out.println("Number of tickets available: " + ticketsAvailable);

        input.close();
    }
}
