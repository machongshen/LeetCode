package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        //declare variables
    	
        List<List<Integer>> totallist = new ArrayList<List<Integer>> ();
        List<Integer> list = new ArrayList<Integer> ();
        //corner case
        Arrays.sort(num);
        Arrays.asList(num);
        if (num ==null || num.length == 0)
            return null;
        if (num.length == 1) {
            list.add(num[0]);
            totallist.add(list);
            return totallist;
        }
        //BackTracking
        for (int i = 0; i < num.length; i++){
            list = new ArrayList<Integer> ();
            list.add(num[i]);
            if (!totallist.contains(list))
            totallist.add(list);
            list = new ArrayList<Integer> ();
            for(int j = i; j < num.length; j++){
            	
             //   list.add();
            }
        }
		return totallist;
        
        
     }
}
