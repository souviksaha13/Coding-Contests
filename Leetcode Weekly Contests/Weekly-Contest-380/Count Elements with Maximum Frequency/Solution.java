class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxi = 0;
        
        for(int num : nums) {
            freq[num]++;
            maxi = Math.max(maxi, freq[num]);
        }
        
        int ans = 0;
        
        for(int el : freq) {
            if(el == maxi) ans += el;
        }
        
        return ans;
    }
}