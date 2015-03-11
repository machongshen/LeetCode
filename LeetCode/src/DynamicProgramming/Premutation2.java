package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Premutation2 {
	public List<List<Integer>> permuteUnique(int[] num) {
	      //remove corner case  
	          List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (num.length == 0 ){
	            result.add(new ArrayList<Integer> ());
	            return result;
	        }
	        if (num.length ==1 ){
	            List<Integer> list = new ArrayList<Integer> ();
	            list.add(num[0]);
	            result.add(list);
	            return result;
	        }
	        Arrays.sort(num);
	        permuteCore (0 , num , result);
	        return result;
	    }
	  private void permuteCore(int i ,int [] num, List<List<Integer>> result){
	        if (i == num.length){
	            List<Integer> tmp = new ArrayList<Integer>();
	            for (int j = 0; j < num.length; j++){
	                tmp.add(num[j]);
	            }
	            result.add(tmp);
	            return;
	        }
	        for ( int k = i; k< num.length ;k++){
	            if (containsDuplicate(num, i, k)){
	                
	                swap (num, k, i);
	            permuteCore(i+1, num, result);
	                swap (num, i, k);
	        }
	    }
	  }
	  //remove duplicate
	     private boolean containsDuplicate(int [] num, int start, int end) {
	         for (int i = start; i< end ; i++){
	             if (num[i]==num[end]){
	             return false;
	             }
	         }
	         return true;
	     }
	     private void swap ( int [] num, int left, int right){
	            int tmp = num[left];
	            num[left] = num[right];
	            num[right] = tmp;
	        }
}
