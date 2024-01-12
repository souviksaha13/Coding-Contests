import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int m = nums1.length/2;
        int ans = 0;
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        
        for(Integer el : nums1) {
            s1.add(el);
        }
        
        for(Integer el : nums2) {
            s2.add(el);
        }
        
        for(Integer el : s1) {
            if(s2.contains(el)) common.add(el);
        }

        int c = common.size();
        
        ans += Math.min(m, s1.size()-c);
        ans += Math.min(m, s2.size()-c);
        
        
        ans = Math.min(m*2, ans+c);
        
        return ans;
    }
}