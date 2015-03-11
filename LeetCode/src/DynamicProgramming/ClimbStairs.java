package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
	public int climbStairs(int n) {
		
        if (n==1)
        {
            return 1;
        }
        if (n==2)
        {
            return 2;
        }
        int a [] = new int [n];
        a[0]=1;
        a[1]=2;
        for(int i=2; i<n ; i++)
        {
            a[i]=a[i-2]+a[i-1];//后一个是前两个的和；
        }
        return a[n-1];
        
    }
}
