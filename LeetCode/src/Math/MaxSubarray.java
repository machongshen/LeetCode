package Math;

public class MaxSubarray {
	public static int maxSubArray(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int sum = A[0];
		int maxsum = A[0];
		for (int i = 1; i < A.length; i++) {
			sum = Math.max(A[i], sum + A[i]);	
			maxsum = Math.max(sum, maxsum);
			System.out.println("Current Sum="+sum);
		System.out.println("Current Maximum="+maxsum);
		}

		return maxsum;

	}

	public static void main(String args[]) {
		int b[] = {-2,1,-3,4,-1,2,1,-5,4};
		int a = maxSubArray(b);
		System.out.println("Max Subarray=" + a);
	}
}
