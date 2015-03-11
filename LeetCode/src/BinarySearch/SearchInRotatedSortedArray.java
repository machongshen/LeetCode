package BinarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] A, int target) {
        int right = A.length - 1, left = 0;
        while(left < right ){
            int mid = (left + right) / 2;
            if ( A[mid] > A[right] ){
                left = mid + 1;
            } 
            else right = mid;
        }
        int rot = left;
      
        if (target > A[rot] && target <= A[A.length -1]){
            left = rot; 
            right = A.length -1;
        }
        else if (target > A[rot] && target > A[A.length -1]){
            left = 0;
            right = rot - 1;
            
        }
       
        while (left < right){
        	int mid = (left + right) / 2;
        	  
            if (A[mid] < target){
                left = mid + 1;
               
            }else if (A[mid] >target)
           { right = mid;}
           else return mid;
        }
        
         return (A[left] == target) ? left : -1 ;
    }
    public static void main (String args[] ){
    	SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
    	int k [] = {5,1,3};
    	System.out.println(s.search(k, 3));
    }
}
