package basicprograms.com;
import java.util.*;
public class Quadratic {
	
	public static int findRoot(int a , int b , int c) {
		/*
		 * @purpose: calculate the determinant  (b*b -4*a*c)
		 * @return: int data type
		 */
	    int sum  = b*b -4*a*c;
		System.out.println(sum);
          return sum;
     }
	
	public static double findRoot1(int a , int b , int delta) {
		/*
		 * @purpose: calculate root1 using (-b + Math.sqrt(delta))/(2*a)  
		 * @return: double data type
		 */
		double root1 =  (-b + Math.sqrt(delta))/(2*a);
		System.out.println(root1);
		   return root1;
	}
	
	public static double findRoot2(int a , int b , int delta) {
		/*
		 * @purpose: calculate root2 using (-b - Math.sqrt(delta))/(2*a)  
		 * @return: double data type 
		 */
		double root2 =  (-b - Math.sqrt(delta))/(2*a);
		System.out.println(root2);
		  return root2;
	}
	public static void main(String args[]) {
		/*
		 * @purpose: Give the input from user and call the method
		 * @return : Void 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    
		int delta = findRoot(a , b , c);
		double root1 = findRoot1(a , b , delta);
		double root2 = findRoot2(a , b , delta);
	}
}

