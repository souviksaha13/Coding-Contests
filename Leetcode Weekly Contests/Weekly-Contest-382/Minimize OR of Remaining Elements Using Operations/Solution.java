class Solution {
    public int minOrAfterOperations(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        //Iterating from MSB to LSB
        for(int i=30; i>=0; i--) {
            int cnt = 0;  // keeps count of the elements which doesn't contribute to set the ith bit
            int curr = (1 << 30)-1;

            int target = ans | (1 << i) -1;

            for(int num : nums) {
                curr &= num;

                // this tracks which element contribute to set the ith bit, keeping track of the previous operations also
                if((curr | target) == target) {
                    cnt++;
                    curr = (1 << 30) -1;
                }
            }

            // if no. of elements which contribute to set the ith bit, then the ith bit will be set in the answer
            if(n-cnt > k) {
                ans |= (1<<i);
            }
        }

        return ans;
    }
}