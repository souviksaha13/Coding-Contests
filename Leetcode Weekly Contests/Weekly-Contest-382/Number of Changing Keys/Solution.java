// Intuition
/*
 * if the ascii difference between ith and (i-1)th character is 0 -> the characters are same (aa, AA)
 * if the ascii difference between ith and (i-1)th character is 32 -> same characters but one is capital and other is small (aA, Aa)
 * so, if the difference is either 0 or 32, then the key is not changing, otherwise it is changing
 */


class Solution {
    public int countKeyChanges(String s) {
        int ans = 0;
        
        for(int i=1; i<s.length(); i++) {
            if((Math.abs(s.charAt(i) - s.charAt(i-1)) != 32) && (Math.abs(s.charAt(i) - s.charAt(i-1)) != 0)) ans++;
        }
        
        return ans;
    }
}