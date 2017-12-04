import java.util.Calendar; //Imports various java utilities for the Calendar function and the utility which enables the program to read from console input
import java.util.Scanner;
import java.util.TimeZone;


public class TicketSystem {
	public static void main(String[] args) {
        
		boolean Done = false;                                       //Declares variables used in calculations
        double subtotal = 0;
        String NoOfTickets = "0";
        Short NoOfTickets2 = 0;
        String InputTicketType = "";
        Scanner scanner = new Scanner(System.in);
        																
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());   //Discount calculations, reduces price of all tickets by 2 if it is Wednesday (4)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);   
        
        if  (dayOfWeek == 4) {
       		Standard.Price = Standard.Price - 2;
       		OAP.Price = OAP.Price - 2;
       		Student.Price = Student.Price - 2;
       		Child.Price = Child.Price - 2;
       	}

//Interface
        
        System.out.println("Welcome to QA Cinema!");
        System.out.println("The following cinema tickets are available for purchase:");
        System.out.println("");
        System.out.println("Standard ticket : £" + Standard.Price + "0");														//Interface, just dispenses instructions to user
        System.out.println("OAP ticket : £" + OAP.Price + "0");
        System.out.println("Student ticket : £" + Student.Price + "0");
        System.out.println("Child ticket : £" + Child.Price + "0");
        System.out.println();
        System.out.println("Please input the ticket type you wish to purchase (eg 'Standard') and press the Enter key.");
        System.out.println("When you are finished, type 'Done' and press the Enter key.");
        System.out.println("");

       	WhichTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);					//Calls WhichTicket method to determine which ticket the user wants to buy
	}  
        
//Ticket choice tree	
	
	public static void WhichTicket(boolean Done, double subtotal, String NoOfTickets, Short NoOfTickets2, String InputTicketType, Scanner scanner) {  //New method, inherits variables from main
     	
        
        	InputTicketType = scanner.nextLine();
        																												//Nested If statements to determine correct ticket type
        	if ("Standard".equals(InputTicketType)) {																	//Each If statement calls a method for each ticket type, plus variables
        		Standard.StandardTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
        	}	else {
        		if ("OAP".equals(InputTicketType)) {
        			OAP.OAPTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
        		} else {
        			if ("Student".equals(InputTicketType)) {
                		Student.StudentTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
                	}	else {
                		if ("Child".equals(InputTicketType)) {
                    		Child.ChildTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);
                    	}	else {
                    		if ("Done".equals(InputTicketType)) {
                    			Done(Done, subtotal);						
                    		}	else {
                    				System.out.println("Invalid ticket type! Ticket name is case-sensitive.");
                    				WhichTicket(Done, subtotal, InputTicketType, NoOfTickets2, InputTicketType, scanner);}
        						 }
                			 }
        					
        		  	  } }
	}
	
	private static void Done(boolean Done, double subtotal) {										
	     
		System.out.println("The total cost of tickets for this movie is £" + subtotal + "0.");					
		Done = true;																				//Changes 'Done' to true, ending the loop and the program.
	
	}
}    	
	

        
        	


