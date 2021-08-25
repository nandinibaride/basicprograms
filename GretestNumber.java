package basicprograms.com;
import java.util.*;
public class GretestNumber {
	public static void main(String args []) {
		/*
		 * @purpose: Find the greatest number in given three number
		 * @return: No return value
		 */
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
    int firstnum= sc.nextInt();
    System.out.println("Enter the second number");
    int secondnum = sc.nextInt();
    System.out.println("Enter the third number");
    int thirdnum = sc.nextInt();
    
     if (firstnum > secondnum && firstnum > thirdnum)
    	 System.out.println(firstnum + "is gratest number:");
     else if(secondnum > thirdnum)
    	 System.out.println(secondnum + "is gratest number:");
     else
    	 System.out.println(thirdnum +  "is gratest number:");
	}
}