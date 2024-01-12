import java.util.*;

class Solution {
    public static int minOPs(int n, int[] A) {
        // code here
        Arrays.sort(A);
        int freq = 1;
        List<Integer> ls = new ArrayList<>();
        
        for(int i=1; i<n; i++) {
            if(A[i] == A[i-1]) freq++;
            else {
                ls.add(freq);
                freq = 1;
            }
        }
        ls.add(freq);
        int sum = 0;
        Collections.sort(ls);
        int m = ls.size();
        int ans = -1;
        
        for(int i=m-1; i>=0; i--) {
            sum += ls.get(i);
            ans++;
            if(sum > n/2) return ans;
        }
        
        return m;
    }
}