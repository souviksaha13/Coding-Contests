Dominating Geek
Accuracy: 38.08%
Submissions: 4K+
Points: 20
An array of size n is said to be dictatorial if there exists an element with frequency strictly greater than n/2 in the array. Geek has an array A, he can perform the following operation this operation any number of times,
• Choose a number x, and change all occurances of x in the array A to any integer y.
Find the minimum number of operations Geek needs to perform in order to make the array dictatorial.
Example 1:
Input:
n = 4
A = [1, 3, 4, 1]
Output: 1
Explanation: Geek can change 3 to 1, the array becomes [1, 1, 4, 1] which makes it dominating.
Example 2:
Input:
n = 5
A = [2, 3, 5, 3, 1]
Output: 1
Explanation: Geek can change all 3's to 2, the array becomes [2, 2, 5, 2, 1] which makes it dominating.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function minOPs) that takes an integer n and the array A[] as input argument. The driver code takes care of the printing.
Constraints:
1<=n<= 10^5
0 <= A[i] <= 10^9