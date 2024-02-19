import java.util.Arrays;

class Solution {
    public int maxSelectedElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = -1;
        
        int[] dp = new int[nums[n-1]+3];
        
        for(int i=n-1; i>=0; i--) {
            int val = nums[i];
            dp[val] = 1 + dp[val+1];
            dp[val+1] = 1 + dp[val+2];
            
            ans = Math.max(ans, Math.max(dp[val], dp[val+1]));
        }
        
        return ans;
    }
}