class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int mid = (right + left)/2;

        while(left<=right){
            mid = (right + left)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && nums[mid]>target){
                    right = mid;

                }else{
                    left = mid+1;
                }
            }else{
                if(nums[mid]<target && nums[right]>=target){
                    left = mid;
                }else{
                    right= mid-1;
                }
            }
        }

        return -1;
        
    }
}