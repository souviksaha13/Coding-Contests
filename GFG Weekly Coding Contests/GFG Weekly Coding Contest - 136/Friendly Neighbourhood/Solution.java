class Solution {
    public int findMinTime(int a, int b, int n, int[] strength) {
        // code here
        int total_sum = 0;
        
        for(int i=0; i<n; i++) {
            total_sum += strength[i];
        }
        int[][] dp = new int[n][total_sum+1];
        
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        
        return solve(0, a, b, 0, total_sum, dp, strength);
    }
    
    public int solve(int i, int a, int b, int curSum, int sum, int[][] dp, int[] strength) {
        if(i == strength.length) {
            return (int)(Math.max(Math.ceil(curSum/(a*1.0)), Math.ceil((sum-curSum)/(b*1.0))));
        }
        
        if(dp[i][curSum] != -1) return dp[i][curSum];
        
        int pick = solve(i+1, a, b, curSum+strength[i], sum, dp, strength);
        int notPick = solve(i+1, a, b, curSum, sum, dp, strength);
        
        return dp[i][curSum] = Math.min(pick, notPick);
    }
}