package DynamicProgramming;

public class JumpGame2 {
	public static int jump(int[] A) {
		// declare coner case
		if (A.length == 1)
			return 0;
		if (A.length == 0)
			return 0;
		// variables
		int min = 1;
		int maxlen = A[0];
		int curmax = A[0];
		
				
		for (int i = 1; i <=A.length; i++) {
			if (curmax >= A.length - 1) {
				return min;
			}
			System.out.println("good"+curmax);
			
			if (i>curmax) {
				System.out.println("good"+i);
				min++;
				curmax = maxlen;
			}
			maxlen = Math.max(A[i]+i, maxlen);
		}
		return min;
	}

	public static void main(String args[]) {
		int[] k = { 1,2,3 };
		System.out.println(jump(k));
	}
}
