class Solution {
    public static long totalWays(int N) {
        // code here
        long ans = 1;
        for(int i=2; i<=N; i++) {
            ans *= i;
        }
        
        return ans;
    }
}