package DynamicProgramming;

public class SubArrayMaxProduct {
	public int maxProduct(int[] A) {
        if (A.length == 0)
        {
            return 0;
        }
        if (A.length == 1)
        {
            return A[0];
        }
        int max_product = A[0];
        int max = 0;
        int tmp = 1;
        for(int i = 0 ; i< A.length; i++)
        {   
            if (A[i]==0)
            {
                tmp = 1;
            }
            else 
            tmp = tmp*A[i];
            if (tmp>max_product)
            {
                max_product = tmp;
            }
        }
        return max_product;
    }
}
