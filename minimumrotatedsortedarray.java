class Solution {
    public int findMin(int[] nums) {
       int mini = Integer.MAX_VALUE;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            return nums[i+1];
        }
       }
       return nums[0];
    }

      public int findMin(int[] nums) {
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int mid = left +(right-left)/2;
            if(nums[mid]<nums[right]){
                right = mid;
            }
            else{
                left=mid+1;
            }
        }
        return nums[left];
    }
}
