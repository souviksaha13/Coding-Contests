import java.util.*;

class Solution {
    public static int validStrings(int n, int k, String[] arr) {
        // code here
        Set<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        int ans = 0;
        
        for(String str : arr) {
            int cnt = 0;
            
            for(int i=0; i<str.length(); i++) {
                if(hs.contains(str.charAt(i))) cnt++;
            }
            
            if(cnt == k) ans++;
        }
        
        return ans;
    }
}