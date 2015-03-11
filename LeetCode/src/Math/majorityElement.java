package Math;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class majorityElement {
	public static int majorityElement(int[] num) {
        Map<Integer,Integer> mp= new HashMap<Integer,Integer> ();
       
        for(int j : num){
            if (mp.containsKey(j)){
                mp.put(j,mp.get(j)+1);
            }
            else
            mp.put(j,1);
        }
        int keymax=0, valmax=0;
        Iterator iter = mp.entrySet().iterator();
        while(iter.hasNext()){
        	Map.Entry entry = (Map.Entry) iter.next();
        	int key = (Integer) entry.getKey();
        	int val = (Integer) entry.getValue();
        	  System.out.println(key);
        	  System.out.println(val);
        	if (val>valmax)
        	{
        		valmax=val;
        		keymax=key;
        	}
        }
      
        if (valmax>(num.length/2)){
        return keymax;
        }
        else return 0;
    }
	public static void main(String args[]) {
		int b[] = {-1,100,2,100,100,4,100};
		int a = majorityElement(b);
		System.out.println("Max Subarray=" + a);
	}
}

