package String;

public class LongestPlinodrome {
	/*
	 * Brute force public String longestPalindrome(String s) { // declare
	 * variables String max = ""; for (int i = 0; i < s.length(); i++) { for
	 * (int j = i - 1; j >= 0; j--) { String k = s.substring(j, i); if
	 * (isPalindrome(k) && max.length() < k.length()) { max = k; } } } return
	 * max; }
	 * 
	 * private boolean isPalindrome(String k) { int left = 0; int right =
	 * k.length() - 1; while (left <= right) { if (k.charAt(left) ==
	 * k.charAt(right)) { left++; right--; } else return false; } return true; }
	 */
	public String longestPalindrome(String s) {
		// declare variables

		int maxst = 0;
		int maxend = 0;
		// go through middle algorithm
		for (int i = 1; i < s.length() - 1; i++) {//Consider the odd longest Palindrome 
			int left = i - 1;
			int right = i + 1;
			while (left >= 0 && right <= (s.length() - 1)
					&& s.charAt(left) == s.charAt(right)) {
				if (right - left > (maxend - maxst)) {
					maxst = left;
					maxend = right;
				}
				left--;
				right++;
			}
		}
		
		for (int i = 1; i <= s.length()-1; i++) { //Consider the even longest Palindrome 
			if (s.charAt(i) == s.charAt(i-1)) {
				int left = i-1 ;
				int right = i ;
				while (left >= 0 && right <= (s.length() - 1)
						&& s.charAt(left) == s.charAt(right)) {

					if ((right - left) > (maxend - maxst)) {

						maxst = left;
						maxend = right;
					}
					left--;
					right++;
				}
			}
		}
		return s.substring(maxst, maxend + 1);

	}

	public static void main(String args[]) {
		LongestPlinodrome a = new LongestPlinodrome();
		String k = "abba";
		System.out.println(a.longestPalindrome(k));

	}

}
