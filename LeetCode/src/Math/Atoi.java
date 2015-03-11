package Math;

public class Atoi {
    public int atoi(String str) {
        str = str.trim();
        if(str.length() == 0) return 0;
        //declare variables
        boolean flag = true;
        int i = 0;
        int result = 0;
        if (str.charAt(0) == '-')
        { 
            flag = false;
            i++;
        }
        if (str.charAt(0) == '+')
        {
            flag =true;
            i++;
        }
        for ( ; i < str.length(); i++){
        	
        	/*
        	 * Easy version
        	 * if (str.charAt(i) > '9' ||str.charAt(i)<'0')
            {
                break;
            }
            int tmp =str.charAt(i) - '0';
            if(!flag && result>-((Integer.MIN_VALUE+tmp)/10))  
            return Integer.MIN_VALUE;  
            else if(flag && result>(Integer.MAX_VALUE-tmp)/10)  
            return Integer.MAX_VALUE;
            result = result*10+tmp;
        	 */
            if (str.charAt(i) > '9' ||str.charAt(i)<'0')
            {
                break;
            }
            int tmp =str.charAt(i) - '0';
             result = result*10 + (int)tmp;
            if (flag == true && result < 0){
                return Integer.MAX_VALUE;
            }
            if (str.charAt(0)>'9'||str.charAt(0)<'0'){
            if (flag == true && i >= 11 && result > 0 && tmp>=0){
                return Integer.MAX_VALUE;
            }
            if (flag == false && result < 0){
            	return Integer.MIN_VALUE;
            }
            if (flag == false && result > 0&& i >= 11 && tmp>=0){
            	return Integer.MIN_VALUE;
            }
            }
            else{
            if (flag == true && i >= 10 && result > 0 && tmp>=0){
                return Integer.MAX_VALUE;
            }
            if (flag == false && result < 0){
            	return Integer.MIN_VALUE;
            }
            if (flag == false && result > 0&& i >= 10 && tmp>=0){
            	return Integer.MIN_VALUE;
            }
            }
        }
        if (flag)
        {
            return result;
        }
        else return result*(-1);
    }
    public static void main (String args[]){
    	Atoi a = new Atoi();
    	System.out.println(a.atoi("    -10326662300y"));
    }
}
