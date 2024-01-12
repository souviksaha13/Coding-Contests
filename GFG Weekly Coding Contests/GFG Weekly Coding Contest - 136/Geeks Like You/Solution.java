import java.util.*;

class Solution {
    public static ArrayList<Integer> findAnswer(int n, int[] A) {
        // code here
        long[] prefixSum = new long[n];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        prefixSum[0] = A[0];
        
        for(int i=1; i<n; i++) {
            prefixSum[i] = A[i] + prefixSum[i-1];
            ans.add(0);
        }
        
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        
        if(prefixSum[n-1] > 0) ans.set(0, n);
        
        for(int i=n-2; i>=0; i--) {
            // check for the first element of the array
            if(prefixSum[i] > 0) {
                ans.set(0, i+1);
            }
            
            while(!st.isEmpty() && prefixSum[st.peek()] <= prefixSum[i]) st.pop();
            
            if(!st.isEmpty()) ans.set(i+1, st.peek()-i);
            
            st.push(i);
        }
        
        return ans;
    }
}