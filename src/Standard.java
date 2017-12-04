import java.util.Scanner;

public class Standard extends TicketSystem{

    public static Double Price = 8.00;


    public static void StandardTicket (boolean Done, double subtotal, String NoOfTickets, Short NoOfTickets2, String InputTicketType, Scanner scanner) { 
        	
            
    	System.out.println("You have selected Standard ticket, how many would you like to purchase?");					//Takes user input regarding number of tickets
    	NoOfTickets = scanner.nextLine();
    	System.out.println("You have selected "+ NoOfTickets + " Standard tickets.");
    	NoOfTickets2 = Short.valueOf(NoOfTickets);												//Since user input is always a string, it needs to be converted to a numerical variable
    	subtotal = subtotal + (NoOfTickets2 * Standard.Price);															
    	System.out.println("Tickets added - enter another ticket type or enter 'Done' to finish booking.");				
    	TicketSystem.WhichTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);	//Calls method at the start of the loop, and it begins again while keeping variable values
    }
}