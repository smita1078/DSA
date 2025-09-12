class Solution {
//Brute
    public int minSubArrayLen(int target, int[] nums) {
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                count++;
                if(sum>=target){
                    mini=Math.min(mini,count);
                }
            }
        }
        return mini==Integer.MAX_VALUE ? 0 : mini ;
    }
//optimal
    public int minSubArrayLen(int target, int[] nums) {
        int mini = Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                mini=Math.min(mini,right-left+1);
                sum-=nums[left++];
            }
        }
     return mini<Integer.MAX_VALUE ? mini : 0;  
    } 
}

}
