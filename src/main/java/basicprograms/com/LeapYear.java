package basicprograms.com;
import java.util.*;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year :");
		int x1 = sc.nextInt();  
		if(x1%4 == 0) {
			System.out.println("The Year Is Leap Year");
		}
		else {
			System.out.println("The Year Is Not Leap Year");
		}
			
			
		}
	}


