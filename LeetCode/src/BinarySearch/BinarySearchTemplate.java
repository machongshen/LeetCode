package BinarySearch;

public class BinarySearchTemplate {
    public int BinarySearchTemplate(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        while(left < right){
            int mid = (left + right)/2;
         // TODO: Implement conditional checks.
            if(A[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
         
        return  0;
    }
}
