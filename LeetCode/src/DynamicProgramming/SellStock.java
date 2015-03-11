package DynamicProgramming;

public class SellStock {
    public static int maxProfit(int[] prices) {
        if(prices.length==0)
        {
            return 0;
        }
        int max_profit = 0;
        int min =0;
     for(int i = 0; i<prices.length; i++)
     {	 
     	if (prices[i]- prices[min]>max_profit)
     	{	
     		max_profit = prices[i]- prices[min];
     	}
     	if (prices[min]>prices[i]){
     		min = i;
     	}
       	
     }
     return max_profit;
    }
    public static void main(String args[]){
    	int prices[] = {4,1,2};
    	System.out.println(maxProfit(prices));
    }
}
