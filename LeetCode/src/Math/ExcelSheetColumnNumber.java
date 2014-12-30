package Math;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		if (s == null) {
			return 0;
		}
		s = s.toLowerCase();
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			int k = (int) cur - 'a' + 1;
			num = 26 * (num) + k;
		}
		return num;
	}

	public static void main(String args[]) {
		int i = titleToNumber("ABD");
		System.out.println(i);
	}
}
