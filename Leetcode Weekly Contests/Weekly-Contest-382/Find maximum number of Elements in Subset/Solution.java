import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {
        Arrays.sort(nums);
        
        Map<Long, Integer> mp = new HashMap<>();
        
        for(int el : nums) {
            Long val = 1L * el;
            mp.put(val, mp.getOrDefault(val, 0) +1);
        }
        int ans = 1;
        Long one = 1L;
        if(mp.containsKey(one)) ans = mp.get(one);
        if(ans %2 == 0) ans--;
        
        for(int i=0; i<nums.length; i++) {
            Long el = 1L * nums[i];
            if(!mp.containsKey(el)) continue;
            int cnt = 0;
            while(true) {
                // System.out.println(el + " " + mp.get(el) + " " + cnt);
                if(!mp.containsKey(el)) break;
                cnt++;
                int val = mp.get(el);
                mp.remove(el);
                if(val == 1) {
                    break;
                }
                el = el*el;
            }
            cnt = (cnt*2)-1;
            ans = Math.max(ans, cnt);
        }
        
        return ans;
    }
}