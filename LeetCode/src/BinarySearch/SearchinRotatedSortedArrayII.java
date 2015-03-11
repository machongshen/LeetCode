package BinarySearch;

public class SearchinRotatedSortedArrayII {
	public boolean search(int[] A, int target) {
		 int left  = 0;
	        int right = A.length - 1;
	        while(left <= right){
	            int mid = (left+right)/2;
	            if (A[mid] == target) return true; 
	            if (A[left] < A[mid]){
	                if (A[mid]>target &&target >= A[left]){//left is sorted
	                    right = mid-1;
	                }else 
	                    left = mid+1; 
	            }
	            else if (A[left] > A[mid]){
	                if (A[mid] < target &&target <= A[right]){//right is sorted
	                    left = mid+1;
	                }else 
	                    right = mid-1; 
	            }else
	            left ++;//remove duplicates
	        }
	        return  false;
    }
	 public static void main (String args[] ){
		 SearchinRotatedSortedArrayII s = new SearchinRotatedSortedArrayII();
	    	int k [] = {1,1,1,3,1};
	    	System.out.println(s.search(k, 3));
	    }
}
