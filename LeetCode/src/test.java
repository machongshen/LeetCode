import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test {

	public static int max_prefix_suffix(String S) {		
		//Remove Edge-Case  
		if (S.length() == 0) 
			return 1; 
		//declare variables
		int k = S.length();
		int count = 0;
		String pre="";
		String suf="";
		//jump into loop
		for (int i = 1; i < k; i++) {
			pre = S.substring(0, i);
			suf = S.substring(k - i, k);
			//Same string, then update count
			if (pre.equals(suf)) {
				count = suf.length();
			}
		}
		return count;
	}
	public static void main(String args[]) {
		String s = "abbabba";
		System.out.println(max_prefix_suffix(s));
	}
}
