import java.util.Scanner;

public class Student extends TicketSystem {
	
	public static Double Price = 6.00;


	public static void StudentTicket(boolean Done, double subtotal, String NoOfTickets, Short NoOfTickets2, String InputTicketType, Scanner scanner) {
		 
		
		System.out.println("You have selected Student ticket, how many would you like to purchase?");
		NoOfTickets = scanner.nextLine();
		System.out.println("You have selected "+ NoOfTickets + " Student tickets.");
		NoOfTickets2 = Short.valueOf(NoOfTickets);
		subtotal = subtotal + (NoOfTickets2 * Student.Price);	
		System.out.println("Tickets added - enter another ticket type or enter 'Done' to finish booking.");
		TicketSystem.WhichTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
	}
}