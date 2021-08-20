package basicprograms.com;

public class SwapNumber {
	/*
	 * @purpose : Swap number
	 * @return : No return
	 * 
	 */
	public static void main(String agrs []) {
	int x = 100;
	int y = 200;
	
    System.out.println("Before Swap Number");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    
    int swap = x;
    x = y;
    y = swap;

    System.out.println("After swap Number");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
	}
}	
