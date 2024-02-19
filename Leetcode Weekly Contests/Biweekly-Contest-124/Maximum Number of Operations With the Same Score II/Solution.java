class Solution {
    int solve(int i, int j, int sum, int[] nums, int[][] dp) {
        if(i>=j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        
        int o1 = 0, o2 = 0, o3 = 0;
        
        if(nums[i]+nums[i+1] == sum) o1 = 1 + solve(i+2, j, sum, nums, dp);
        
        if(nums[i]+nums[j] == sum) o2 = 1 + solve(i+1, j-1, sum, nums, dp);
        
        if(nums[j]+nums[j-1] == sum) o3 = 1 + solve(i, j-2, sum, nums, dp);
        
        return dp[i][j] = Math.max(o1, Math.max(o2, o3));
    }
    public int maxOperations(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                dp[i][j] = -1;
            }
        }
        
        return 1+ Math.max(solve(2, n-1, nums[0]+nums[1], nums, dp), 
                          Math.max(solve(1, n-2, nums[0]+nums[n-1], nums, dp), solve(0, n-3, nums[n-1]+nums[n-2], nums, dp)));
    }
}