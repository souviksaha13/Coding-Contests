class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int ans = 0;
        
        for(int num : nums) {
            sum += num;
            if(sum == 0) ans++;
        }
        
        return ans;
    }
}