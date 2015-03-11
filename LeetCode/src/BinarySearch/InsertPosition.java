package BinarySearch;

public class InsertPosition {
    public int searchInsert(int[] A, int target) {
        if (A.length == 1 && target == A[0]) return 0;
        int left = 0;
        int right = A.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            if(A[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
         
        return  (target > A[left]) ? left+1 : left;
    }
}
