package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	 public int[] twoSum(int[] numbers, int target) {
         int[] solution = new int[2];
        Map<Integer,ArrayList<Integer>> sb = new HashMap<Integer,ArrayList<Integer>> ();
        
        for (int i = 0; i< numbers.length;i++)
        {   
            if (sb.containsKey(numbers[i]))
            {
                sb.get(numbers[i]).add(i+1);
            }
            else 
             {
              ArrayList<Integer> sby=new ArrayList<Integer>();
             sby.add(i+1);
             sb.put(numbers[i],sby);
             }
        }
            for (int k=0; k<numbers.length;k++)
            {        
                  
                    if ( sb.containsKey(target-numbers[k]) ) 
                    {   boolean isDouble=target==2*numbers[k];
                       if(isDouble&&sb.get(numbers[k]).size()!= 1 )
                       {
                           solution[0] = sb.get(numbers[k]).get(0);
                           solution[1] = sb.get(numbers[k]).get(1);
                            break;
                       }
                       
                       
                    else  if ((!isDouble)&&sb.get(numbers[k]).size()==1)
                    {  
                        solution[0] = sb.get(numbers[k]).get(0);
                        solution[1] = sb.get(target-numbers[k]).get(0);
                        break;
                    }
                   
                    }
                
             
            }
         return solution;  
    }
}
