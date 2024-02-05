class Solution {
    public static int PossibleStrings(int N, int K) {
        // code here
        if(K == 1) return 0;
        long mod = 1000000007;
        long[] dp = new long[N+1];
        dp[1] = 26l;
        
        for(int i=2; i<=N; i++) {
            if(i<K) {
                dp[i] = 1l*((dp[i-1]*26) % mod);
            }
            
            else if(i == K) {
                dp[i] = 1l*(((dp[i-1]*26)%mod - 26l + mod) % mod);
            }
            
            else {
                dp[i] = 1l*(((dp[i-1]*26)%mod - (dp[i-K]*25)%mod + mod) % mod);
            }
        }
        
        return (int)dp[N];
    }
}