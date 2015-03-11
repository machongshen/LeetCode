package Array;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] num) {
		boolean flag = true;
		for (int i = num.length - 1; i > 0; i--) {
			if (num[i] > num[i - 1]) {
			
				Arrays.sort(num, i, num.length);
				for (int j = i; j < num.length; j++) {
					if (num[i-1] < num[j]) {	
						swap(num, j, i-1);
						flag = false;
						break;
					}
				}	
			}
			if (flag == false) {
				break;
			}
			if (i == 1 && flag == true) {
				Arrays.sort(num);
			}
		}
	}

	private int[] swap(int[] num, int pre, int af) {
		int tmp = num[pre];
		num[pre] = num[af];
		num[af] = tmp;
		return num;
	}

	public static void main(String args[]) {
		NextPermutation a = new NextPermutation();
		int[] sb = { 3,2,1};
		a.nextPermutation(sb);
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i]);
		}
	}
}
