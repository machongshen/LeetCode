package DynamicProgramming;

public class SellStock2 {
	 public int maxProfit(int[] prices) {
	        //remove corner cases
	        if (prices.length==0||prices.length==1){ 
	            return 0;
	        }
	        // variables declaration	        
	        int max_profit = 0;
	        int tmp = 0 ;
	        String s = "123";
	        char a = 'a';
	        
	        //real greedy algorithm
	        for (int i = 1; i < prices.length;i++){
	            tmp=prices[i]-prices[i-1];//greedy algorithm
	            if(tmp>0) //if the tempory profit > 0, the maximum profit will be updated;
	            max_profit+=tmp;
	        }
	        return max_profit;
	    }
}
