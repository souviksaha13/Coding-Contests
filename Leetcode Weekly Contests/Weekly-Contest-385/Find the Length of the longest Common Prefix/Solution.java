import java.util.*;

class Solution {
    int findLen(int n) {
        int len = 0;
        while(n != 0) {
            n /= 10;
            len++;
        }
        
        return len;
    }
    
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int mlen1 = 0, mlen2 = 0;
        
        for(int i=0; i<arr1.length; i++) {
            mlen1 = Math.max(mlen1, findLen(arr1[i]));
        }
        
        for(int i=0; i<arr2.length; i++) {
            mlen2 = Math.max(mlen2, findLen(arr2[i]));
        }
        
        int len = Math.min(mlen1, mlen2);
        
        int maxLen = (int)Math.pow(10, len);
        
        Set<Integer> hs = new HashSet<>();
        
        while(maxLen != 0) {
            for(int i=0; i<arr1.length; i++) {
                int val = arr1[i];
                while(val > maxLen) val /= 10;
                hs.add(val);
            }
            int ans = -1;
            
            for(int i=0; i<arr2.length; i++) {
                int val2 = arr2[i];
                while(val2 > maxLen) val2 /= 10;
                if(hs.contains(val2)) {
                    ans = Math.max(ans, findLen(val2));
                }
            }
            if(ans != -1) return ans;
            
            maxLen /= 10;
            hs.clear();
        }
        
        return 0;
    }
}