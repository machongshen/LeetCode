package String;

public class Palindrome {
	public static boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        s= s.replaceAll("[^A-Z^a-z^0-9]+","");
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String s1= sb.toString();
        return s1.equals(s);
    }
	public static void main (String args[]){
		if (isPalindrome("a.#")==true){
			System.out.println("good");
		}
	}
}
