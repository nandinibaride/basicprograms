package basicprograms.com;
import java.util.*;

public class SumOfThreeIntAddZero {
 public static void main(String args[]) {
	 /*
	  * @purpose: Find the three numbers this number sum will be zero
	  * @return: No return value
	  */
	 
	 int array[] = {1, 2, -3, 4 ,  -2 , -4 ,5 , 6 , 7  };
	 
      for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
      for (int k = j + 1; k < array.length; k++) {
       if (array[i] + array[j] + array[k] == 0) {
        System.out.println(  array[i] +" "+ array[j] + " " + array[k]);
                 }
             }
         }
     }
  }
}


