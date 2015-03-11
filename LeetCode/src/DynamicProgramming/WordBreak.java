package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
        if (s.length()==1 && dict.contains(s))
        {
            return true;
        }
        boolean [] sb = new boolean[s.length()];
        Arrays.fill(sb,false);
        
        for (int i = 1; i <= s.length(); i++)
        {   
           
        	   if (dict.contains(s.substring(0,i)))
               {
                   sb[i-1]=true;
 
               }
               for (int j = i-1; j >= 0; j--){
                   if (sb[j]&&dict.contains(s.substring(j+1,i)))
                   { 
                	   //               	   if (i==s.length())
//                   {
//                	   System.out.println(j+s.substring(j+1, i));
//                   }
                	  sb[i-1]=true;
                      break;
                   }
               }
        }
        return sb[s.length()-1];
    }
	public static void main(String args[]) {
		WordBreak a = new WordBreak();
		Set<String> set = new HashSet<String>();
		set.add("dog");
		set.add("s");
		set.add("gs");
		String s = "dogs";
		//System.out.println(s.substring(0, 1));
		System.out.println(a.wordBreak(s, set));
		
		
	}
}
