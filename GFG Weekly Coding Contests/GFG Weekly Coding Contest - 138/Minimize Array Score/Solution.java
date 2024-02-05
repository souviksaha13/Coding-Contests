import java.util.*;

// Intuition
/*
 * Our goal is to keep the sum of the pairs minimum. 
 * In order to achieve that, we need to add the largest element with the smallest element
 * The second largest element with the smallest element, and so on
 * 
 * Thus, we need to consider a Two pointer approach, and keep a track of the maximum sum of pairs
 */

class Solution {
    public static int minimizeArrayScore(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum = Integer.MIN_VALUE;
        
        int lo = 0, hi = n-1;
        
        while(lo < hi) {
            int val = arr[lo] + arr[hi];
            sum = Math.max(sum, val);
            lo++; hi--;
        }
        
        return sum;
    }
}
        
