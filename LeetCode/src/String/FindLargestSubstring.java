package String;

import java.util.HashMap;

public class FindLargestSubstring {
	public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
        return 0;
        }
        
        s = s.trim();
        char[] arr=s.toCharArray();  
        int max =1;
        int length = 0;
        System.out.println(arr.length);
        HashMap<Character,Integer> map= new HashMap<Character, Integer> ();
        map.put(arr[0], 0);
        for (int i = 1; i < s.length() ; i++){
        	
           if  (!map.containsKey(arr[i])||(i-map.get(arr[i]))>length){
        	   length ++;
           } else {
            	   length=i-map.get(arr[i]);//长度换成从重复字后一位到当前；
               }
               
           map.put(arr[i], i);//不管什么情况都要更新map char 位置
           max = Math.max(length,max);//随时更新max
          
        }
        return max;
    }
	
	public static void main(String args[]){
		FindLargestSubstring a = new FindLargestSubstring();
		System.out.println(a.lengthOfLongestSubstring("hchzvfrkmlnozjk"));
	
	}
}
