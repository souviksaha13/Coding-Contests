class Solution {
    public int maxOperations(int[] nums) {
        int ans = 0;
        int score = nums[0] + nums[1];
        
        for(int i=0; i<nums.length-1; i+=2) {
            if((nums[i] + nums[i+1]) == score) ans++;
            else break;
        }
        
        return ans;
    }
}
