package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	 public List<String> anagrams(String[] strs) {
	        List<String> ls= new ArrayList<String>();
	        Map<String,Integer> mp= new HashMap<String,Integer>();
	        
	     for (int i = 0; i< strs.length;i++){
	    	mp.put(strs[i],i);
	    }
	     for  (int i = 0; i< strs.length;i++){
	    	StringBuffer a = new StringBuffer(strs[i]);
	    	String k= a.reverse().toString();
	    	if (strs.length>1)
	    	{
	    	if (mp.containsKey(k))
	    	{
	    	    ls.add(strs[i]);
	    	}
	    	}
	    } 
		return ls;
	}
}
