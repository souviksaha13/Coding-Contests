import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        
        // for(int i=0; i<26; i++) {
        //     last[i] = -1;
        // }
        
        int maxFreq = 0;
        
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(i)-'a']);
            last[s.charAt(i)-'a'] = i;
        }
        
        Map<Integer, Character> mp = new TreeMap<>();
        
        for(int i=0; i<26; i++) {
            if(freq[i] == maxFreq) {
                char c = (char)(i+'a');
                int lastOcc = last[i];
                // System.out.println((char)(i+'a') + " " + last[i]);
                mp.put(lastOcc, c);
            }
        }
        String ans = "";
        
        for(Map.Entry<Integer, Character> m : mp.entrySet()) {
            ans = ans + m.getValue();
        }
        
        return ans;
    }
}