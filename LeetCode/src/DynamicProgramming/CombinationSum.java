package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        List<Integer> list = new ArrayList<Integer> ();
        combinationHelper(candidates,result, list, target, 0);
        return result;
    }
    public void combinationHelper(int[] candidates, List<List<Integer>> result, List<Integer> list, int target, int i){
        if (target == 0){
            result.add(new ArrayList<Integer>(list));
        }
        for (int j = i ; j < candidates.length&&target>=candidates[j] ; j++ ){
            list.add(candidates[j]);
            combinationHelper(candidates,result,list,target-candidates[j+1],j+1);
            list.remove(list.size()-1);
        }
    }
    
}
