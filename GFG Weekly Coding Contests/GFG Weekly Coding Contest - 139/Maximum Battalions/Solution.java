import java.util.*;

class Solution 
{
    public static int maximumBattalions(int N, String[] names) 
    {
        // code here
        Map<String, Integer> mp = new HashMap<>();
        
        for(int i=0; i<names.length; i++) {
            mp.put(names[i], i);
        }
        int ans = 1;
        int end = mp.get(names[0]);
        
        for(int i=1; i<names.length; i++) {
            if(i > end) ans++;
            end = Math.max(end, mp.get(names[i]));
        }
        
        return ans;
    }
}