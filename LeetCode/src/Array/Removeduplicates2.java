package Array;

public class Removeduplicates2 {
	public int removeDuplicates(int[] A) {
        if (A.length < 3)
        {
            return A.length;
        }
        int j = 0;
        int count = 0;
        for (int i = 1; i < A.length ; i++){
            if (A[j]==A[i])
                count++;
            else 
                count = 0;
            if (count < 2)
                j++;    
                A[j]=A[i];
        }
        return j+1;
    }
}
