package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	public List<List<Integer>> combinationSum2(int[] num, int target) {
        //remove edge case
        if (num.length == 0) return null;
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        List<Integer> list = new ArrayList<Integer>();
        //backtracking call
        CombHelper(num, list, result, target, 0);
        return result;
         
    }
    //backtracking function
    public void CombHelper(int[] num , List<Integer> list, List<List<Integer>> result, int target, int i){
       if (target == 0)
       {
            result.add(new ArrayList<Integer> (list));
       }
       for(int j = i; j < num.length && target - num[j] >= 0 ; j++){
           list.add(num[j]);
           CombHelper(num, list, result, target-num[j], j+1);
           list.remove(list.size()-1);
           while (j < num.length -1 && num[j]==num[j+1])
           {
               j++;  // remove duplicates
           }
       }
        }

}
