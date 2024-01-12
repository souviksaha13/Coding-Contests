Divide and Rule
Accuracy: 31.57% Submissions: 5K+ Points: 10
Geek has an array of length N. He wants to divide the array into four parts which follows these conditions:
• Two of the four parts are of equal length. Same for the other two parts as well.
• All four parts must not be of equal length.
Find the number of ways in which the array can be partitioned satisfying these conditions.
Example 1:
Input:
N = 6
Output: 6
Explanation:
The array can be divided into subarrays of following lengths [1, 1, 2, 2]
[1, 2, 1, 2]
[1, 2, 2, 1]
[2, 2, 1, 1]
[2, 1, 2, 1]
[2, 1, 1, 2]
Example 2:
Input:
N = 3
Output: 0
Explanation:
The array cannot be divided into parts satisfying the conditions.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function numOfWays) that takes N, the size of array as input argument. The driver code takes care of the printing.
Constraints:
1<= N<= 109