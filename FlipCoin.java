package basicprograms.com;
import java.util.*;

public class FlipCoin {
	public static void main(String args[]) {
		/*
		 * @purpose: To calculate percentage to head and  tail
		 * @return: No return value
		 */
		
		 int i = 1 ;
		 int Head = 0 ;
		 int Tail = 0 ;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The number of time to filp the coin");
		 int num=sc.nextInt();
		 
				while (i <= num) {
					double randomnum=Math.random();
					if (randomnum < 0.5) {
					  Tail++;
		 			}
					else {
		  			Head++;
					}
				   i++;
				    }
				System.out.println("Head = "+Head);
				System.out.println("Tail = "+Tail);

		        int HeadPercentage=(Head*100)/num;
				int TailPercentage=(Tail*100)/num;
				System.out.println("Head Percentage = "+HeadPercentage + "%");
		                System.out.println("Tail Percentage = "+TailPercentage + "%");
		        sc.close();
		        }
		}
	
	