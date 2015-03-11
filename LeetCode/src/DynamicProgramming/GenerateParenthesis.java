package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		generateParenthesisHelper(n, 0, "", list);
		return list;
	}
	//Backtracking
	public void generateParenthesisHelper(int leftRemain, int rightRemain,
			String s, List<String> list) {
		if (leftRemain == 0 && rightRemain == 0) {
			list.add(s);
			return;
		}
		String tmp;
		if (rightRemain > 0) {
			tmp = s + ")";
			generateParenthesisHelper(leftRemain, rightRemain - 1, tmp, list);

		}
		if (leftRemain > 0) {
			tmp = s + "(";
			generateParenthesisHelper(leftRemain - 1, rightRemain + 1, tmp,
					list);
		}
	}
}
