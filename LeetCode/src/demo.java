import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demo {
	public static String largestNumber(int[] num) {
		String[] list = new  String [num.length]; 
		String k = "";
		for (int i = 0; i<num.length;i++ ){
			list[i] = String.valueOf(num[i]);
		}
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String t1 =  o1+ o2;
				String t2 =  o2 + o1;
				//BigInteger a1= new BigInteger(t1);
				//BigInteger a2= new BigInteger(t2);
				if (t1.compareTo(t2)<0) {
					return 1;
				} else
					return -1;
			}
		};
		Arrays.sort(list,comparator);
		
		for (String s : list){
			k+=s;
		}
		return k;
	}

	

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		int[] a = { 67, 378, 89 };
		largestNumber(a);
		System.out.println(largestNumber(a));
	}
}
