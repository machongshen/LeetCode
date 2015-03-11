package DynamicProgramming;

public class EncodingWay {
    public static int numDecodings(String s) {
        //removecorner case
        s = s.trim();
        if (s.length()==0  ){
            return 0;
        }
        if (s.charAt(0)=='0' ){
            return 0;
        }
        if (s.length()==1&&s!="0"){
            return 1;
        }
        //define variables 
        int count = 1;
        //go throught dp 
        for(int i = 2; i<=s.length(); i++)
        {   
        	String sb = s.substring(i-2,i);
        	
            if (s.charAt(i-1)-'0'==0 && Integer.parseInt(sb)<=26&&s.length()>2 ){
            	
            	count--;
            }
            if(Integer.parseInt(sb)==0||(Integer.parseInt(sb)>26&&i==s.length()&&s.charAt(i-1)-'0'==0))
            {
            	return 0;
            }
            if ( Integer.parseInt(sb)<=26 && s.charAt(i-1)-'0'!=0 ){
            	
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
    	String prices = "100";

    	System.out.println(numDecodings(prices));
    }
}
