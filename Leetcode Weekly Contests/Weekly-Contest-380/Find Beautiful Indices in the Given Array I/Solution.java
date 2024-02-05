import java.util.*;

class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = a.length();
        int m = b.length();
        
        for(int i=0; i<s.length()-n+1; i++) {
            if(s.substring(i, i+n).equals(a)) a1.add(i);
        }
        
        
        for(int i=0; i<s.length()-m+1; i++) {
            if(s.substring(i, i+m).equals(b)) b1.add(i);
        }
        
        int x=0, y = 0;
        
        while(x<a1.size() && y<b1.size()) {
            int i = a1.get(x);
            int j = b1.get(y);
            if(Math.abs(j-i) <= k) {
                ans.add(i);
                x++;
            }
            else {
                if(i<j) x++;
                else y++;
            }
        }
        
        return ans;
    }
}