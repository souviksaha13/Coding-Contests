import java.util.*;

class Solution {
    public static int maxHappy(int n, int[] bags, int m, int[] req) {
        // code here
        Arrays.sort(bags);
        Arrays.sort(req);
        
        int i = 0, j = 0, ans = 0;
        
        while(i<n && j<m) {
            if(bags[i] >= req[j]) {
                i++;
                j++;
                ans++;
            }
            else i++;
        }
        
        return ans;
    }
}