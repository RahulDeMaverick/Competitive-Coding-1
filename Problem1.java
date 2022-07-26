// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8};
        int missingValue= search(nums);
        System.out.println("missing value>>>"+missingValue);
    
    }
    
    public static int search(int[] nums){
        int low= 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(mid>=0){
                if(mid ==0) return nums[mid]-1;
                      if(nums[mid] -mid == 2 && (nums[mid-1] - (mid-1) ==1))
                       return nums[mid]-1;
                else if(nums[mid] - mid ==1)
                       low = mid+1;
                else
                       high =mid-1;
            }
                         }
                         return -1;
                         }
}
