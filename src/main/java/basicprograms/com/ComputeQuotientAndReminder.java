package basicprograms.com;
import java.util.*;
public class ComputeQuotientAndReminder {
	/*
	 * @purpose : Calculate Quotient and Reminder 
	 * @return : No return value 
	 */
	public static void main(String args[]) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Divdent :");
    int Divdent = sc.nextInt();
    
    Scanner sc1= new Scanner(System.in);
    System.out.println("Divisor :");
    int Divisor = sc.nextInt();
    
    int Quotient = Divdent / Divisor;
    int Reminder = Divdent % Divisor;
    
    System.out.println("Quotient --> " + Quotient);
    System.out.println("Reminder --> " + Reminder);
    
    }
	
}
