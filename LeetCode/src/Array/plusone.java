package Array;

public class plusone {
	  public int[] plusOne(int[] digits) {
	        //conner case
	        if(digits.length == 0 )
	        {
	            return digits;
	        }
	        
	        int val = 1;
	        boolean flag = true;
	        for (int j = 0; j<digits.length;j++){
	            if (digits[j]!=9)
	            {
	                flag = false;
	            }
	        }
	        if (flag==true)
	        {
	            int [] digitss =new int [digits.length+1];
	            digitss[0]= 1;
	            for (int k = 1;k<digitss.length;k++)
	            {
	                digitss[k]=0;
	            }
	            return digitss;
	        }
	        else if (digits[digits.length-1]!=9){
	        	
	            digits[digits.length-1]=digits[digits.length-1]+1;
	            return digits;
	        }
	        else {
	        	 
	            for (int i =digits.length-1; i > -1; i-- ){
	            
	                if (digits [i]!=9)
	                {
	                    digits [i]= digits[i]+1;
	                    break;
	                }
	                else {
	                    digits [i]=0;
	                }
	            }
	        return digits;
	        }
	    }
	  public static void main (String args[]){
		  plusone a = new plusone();
		  int [] k = {2,4,9,3,9};
		  k = a.plusOne(k);
		  for (int i = 0; i<k.length;i++){
		  System.out.print(k[i]);
	  }
}
}
