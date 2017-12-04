import java.util.Scanner;

public class Child extends TicketSystem {
	
	public static Double Price = 4.00;
	

	public static void ChildTicket (boolean Done, double subtotal, String NoOfTickets, Short NoOfTickets2, String InputTicketType, Scanner scanner) {
		
        
		System.out.println("You have selected Child ticket, how many would you like to purchase?");
		NoOfTickets = scanner.nextLine();
		System.out.println("You have selected "+ NoOfTickets + " Child tickets.");
		NoOfTickets2 = Short.valueOf(NoOfTickets);
		subtotal = subtotal + (NoOfTickets2 * Child.Price);	
		System.out.println("Tickets added - enter another ticket type or enter 'Done' to finish booking.");
		TicketSystem.WhichTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
	}
}