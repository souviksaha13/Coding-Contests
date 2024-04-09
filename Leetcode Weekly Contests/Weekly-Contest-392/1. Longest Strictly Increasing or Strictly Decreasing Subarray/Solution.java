class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int cnt = 1;
        boolean inc = true;
        boolean none = true;
        
        for(int i=1; i<nums.length; i++) {
            if(none) {
                if(nums[i] > nums[i-1]) {
                    none = false;
                    inc = true;
                    cnt++;
                    ans = Math.max(ans, cnt);
                }
                
                else if(nums[i] < nums[i-1]) {
                    none = false;
                    inc = false;
                    cnt++;
                    ans = Math.max(ans, cnt);
                }
            }
            
            else if(inc) {
                if(nums[i] > nums[i-1]) {
                    cnt++;
                    ans = Math.max(ans, cnt);
                }
                else if(nums[i] < nums[i-1]) {
                    inc = false;
                    cnt = 2;
                    ans = Math.max(ans, cnt);
                }
                else {
                    none = true;
                    cnt = 1;
                }
            }
            
            else {
                if(nums[i] < nums[i-1]) {
                    cnt++;
                    ans = Math.max(ans, cnt);
                }
                
                else if(nums[i] > nums[i-1]) {
                    inc = true;
                    cnt = 2;
                    ans = Math.max(ans, cnt);
                }
                
                else {
                    none = true;
                    cnt = 1;
                }
            }
        }
        
        return ans;
    }
}
