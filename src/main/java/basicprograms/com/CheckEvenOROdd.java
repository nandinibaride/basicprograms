package basicprograms.com;

import java.util.Scanner;

public class CheckEvenOROdd {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter The Number: ");  
		int num = sc.nextInt(); 
		if(num%2 == 0) 
			System.out.println("The Number Is Even");
			else 
				System.out.println("The Number Is odd");
				
	}
}
