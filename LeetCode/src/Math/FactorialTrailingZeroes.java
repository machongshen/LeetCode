package Math;

import java.math.BigDecimal;
import java.math.BigInteger;
/*
 * need to test whether this could be divide by 5.
 */
public class FactorialTrailingZeroes {
	  public static int trailingZeroes(int n)   {
          int k = 0;
          int tmp = 0;
          for (int i = n ; i>=1 ; i --){
              if (i % 5 == 0)
              {
                  k++;
              }
          
          }
          
          while (k>0)
          {	
        	  tmp +=k;
        	  k/=5;
          }
	        return tmp;

  }
	  public static void main (String args[]){
		  System.out.println(trailingZeroes(200));
	  }
			  
}
