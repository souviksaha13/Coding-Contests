/*
You are given a binary array nums.
You can do the following operation on the array any number of times (possibly zero):
 - Choose any 3 consecutive elements from the array and flip all of them.
Flipping an element means changing its value from 0 to 1, and from 1 to 0.

Return the minimum number of operations required to make all elements in nums equal to 1. 
If it is impossible, return -1.
 

Example 1:

Input: nums = [0,1,1,1,0,0]
Output: 3

Explanation:
We can do the following operations:
Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].


Example 2:

Input: nums = [0,1,1,1]
Output: -1

Explanation:
It is impossible to make all elements equal to 1.


Constraints:

3 <= nums.length <= 105
0 <= nums[i] <= 1
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minOperations(vector<int>& nums) {
        int n = nums.size(), i = 0;
        int operations = 0;

        while(i <= n - 3){
            if (nums[i] == 0) {
                // Flip the elements at indices i, i+1, i+2
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ++operations;
            }
            ++i;
        }

        // Check if there are any remaining zeros that cannot be flipped
        for (int i = n - 2; i < n; ++i) {
            if (nums[i] == 0) {
                return -1;
            }
        }

        return operations;
    }
};