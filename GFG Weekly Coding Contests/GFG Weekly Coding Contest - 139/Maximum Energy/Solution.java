import java.util.*;

class Solution {
    public static int MaximumEnergy(int n, int[] E, int K, int[] P) {
        // code here
        long mod = 1000000007;
        long[] sum = new long[n];
        sum[0] = 1l * E[0];
        
        for(int i=1; i<n; i++) {
            sum[i] = 1l* E[i] + sum[i-1];
        }
        
        Arrays.sort(P);
        
        int st = 0, end = K-1;
        long ans = 0;
        
        while(st < end) {
            ans += sum[P[end]];
            if(P[st] > 0) ans -= sum[P[st]-1];
            ans = ans % mod;
            st++;
            end--;
        }
        
        ans = ans % mod;
        return (int)ans;
    }
}