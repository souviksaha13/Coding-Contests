class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i=0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                String w1 = words[i];
                String w2 = words[j];
                
                int n = w1.length();
                int m = w2.length();
                
                if(n <= m) {
                    if(w2.substring(0,n).equals(w1) && w2.substring(m-n, m).equals(w1)) ans++;
                }
            }
        }
        
        return ans;
    }
}