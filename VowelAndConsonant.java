package basicprograms.com;
import java.util.*;
public class VowelAndConsonant {
	/* 
	 * @purpose: Check the albhabet is vowel or consonant
	 * @return: No return
	 */
	public static void main(String args []) { 
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alphabet:");
	char alphabet = sc.next().charAt(0);
	
	if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
	    System.out.println("Albhabet is vowel");
	else
		System.out.println("Albhabet is consonant");
	}
}