import java.util.*;

class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 0l;
        
        int idx = n/2;
        // if(n%2 != 0) idx--;
        boolean isLarge = false;
        
        if(nums[idx] == k) return 0;
        
        if(nums[idx] > k) {
            isLarge = true;
            ans += nums[idx] - k;
        }
        
        else ans += k - nums[idx];
        
        if(isLarge) {
            for(int i=idx-1; i>=0; i--) {
                if(nums[i] > k) ans += nums[i] - k;
            }
        }
        else {
            for(int i=idx+1; i<n; i++) {
                if(nums[i] < k) ans += k - nums[i];
            }
        }
        
        return ans;
    }
}
