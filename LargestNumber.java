import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
        // Convert int[] to String[]
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Custom sort: compare by concatenated value
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if highest number is "0", return "0"
        if (strNums[0].equals("0")) return "0";

        // Build final result
        StringBuilder sb = new StringBuilder();
        for (String s : strNums) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        String result = sol.largestNumber(nums);
        System.out.println("Largest Number: " + result);
    }
}
