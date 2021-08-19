package basicprograms.com;
import java.util.*;

public class HarmonicNumber {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter The Number: ");  
		int num = sc.nextInt();  
		double sum = 0.0;
		int i = 1;
		for(i=1;i<=num;i++){
			sum  = sum + 1.0/i;
			System.out.println("Harmonic number is:" +sum);
		}
	}

}
