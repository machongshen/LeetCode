package Hashmap;

import java.util.HashMap;

public class SingleNumber {
	public static int singleNumber(int[] A) {
		// declare variables
		int result = 0;
		// do xor operation
		for (int i = 0; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}

	public static void main(String args[]) {
		int A[] = { 1, 1, 2, 2, 3 };
		System.out.println(singleNumber(A));
	}
}
