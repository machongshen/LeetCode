package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		//remove edge case
		if (k == 0)
			return null;
		//declare variables 
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		combineHelper(0, list, result, num, k);
		return result;
	}
	//backtracking
	private void combineHelper(int i, List<Integer> list,
			List<List<Integer>> result, int num[], int k) {
		if (list.size() == k) { 
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for (int j = i; j < num.length; j++) {
			list.add(num[j]);
			combineHelper(j + 1, list, result, num, k);
			list.remove(list.size() - 1); //reset list
		}

	}
}
