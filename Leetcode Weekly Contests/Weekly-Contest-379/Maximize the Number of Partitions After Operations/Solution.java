import java.util.*;

class Solution {
    // declaring global map to reduce the time to create the copy of the map in each iteration
    Map<Long, Integer> mp = new HashMap<>();

    public int solve(int i, int currSet, boolean change, String s, int k) {
        // instead of 3-d DP, using a key to store the changing values in bitwise format which creates a unique number for each unique pair of 3 paramenters
        long key = (((long)i << 27) | (long)(currSet << 1) | (change? 1:0));

        if(mp.containsKey(key)) return mp.get(key);
        if(i == s.length()) return 1;

        int charIndex = s.charAt(i)-'a';
        int updatedCurrSet = currSet | (1 << charIndex);
        int cnt = Integer.bitCount(updatedCurrSet);

        int result;
        if(cnt > k) {
            result = 1 + solve(i+1, 1 << charIndex, change, s, k);
        } else {
            result = solve(i+1, updatedCurrSet, change, s, k);
        }

        // if we have the option to change the character, then we will try for each of the possible alphabets at that index
        if(change) {
            for(int newCharIndex = 0; newCharIndex < 26; newCharIndex++) {
                int newSet = currSet | (1 << newCharIndex);
                int newCnt = Integer.bitCount(newSet);

                if(newCnt > k) {
                    result = Math.max(result, 1 + solve(i+1, 1<<newCharIndex, false, s, k));
                } else {
                    result = Math.max(result, solve(i+1, newSet, false, s, k));
                }
            }
        }

        mp.put(key, result);
        return result;
    }

    public int maxPartitionsAfterOperations(String s, int k) {
        return solve(0, 0, true, s, k);
    }
}
