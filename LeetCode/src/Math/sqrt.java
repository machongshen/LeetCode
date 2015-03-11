package Math;

public class sqrt {
	 public int sqrt(int x) {
	     if(x<0){return -1;}
	     if(x==0){return 0;}
		long low=0;
		long high=x;
		long mid;
		while(low<=high){
			mid=(low+high)/2;
			if(mid*mid==x){return (int)mid;
			}else if(mid*mid<x) {low=mid+1;
			}else{ high =mid-1;}
			}
	
		  mid=(low+high)/2;
		  return (int)mid;
		   
		   
	    }
}
