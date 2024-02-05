class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        int ans = 1;
        int start = k;
        int remaining = n-start;
        
        while(remaining > 0) {
            if(word.substring(start, n).equals(word.substring(0,remaining))) return ans;
            ans++;
            start += k;
            remaining = n-start;
        }
        
        return ans;
    }
}