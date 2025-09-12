class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi = Double.NEGATIVE_INFINITY;
        int n = nums.length;
        int sum=0;
        for(int i=0;i<=n-k;i++){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            double avg= (double)sum/k;
            maxi=Math.max(maxi,avg);
        }
        return maxi;
    }

 public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Slide window
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Max Average: " + sol.findMaxAverage(nums, k)); // Output: 12.75
    }
}
