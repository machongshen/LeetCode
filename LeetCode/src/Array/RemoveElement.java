package Array;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        if(A.length == 0) return 0;
        int count = 0;
        for (int i = 0; i< A.length ; i++){
            if (A[i]==elem)
            { 
                count ++;
                
            }
            else if (count > 0)
            {
                A[i-count]=A[i];
            }
        }
        return A.length - count;
    }
}
