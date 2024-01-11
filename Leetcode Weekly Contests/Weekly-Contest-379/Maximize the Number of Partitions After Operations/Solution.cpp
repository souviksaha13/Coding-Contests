#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    unordered_map<long long, int>dp;
    string S;
    int K;

    int solve(long long idx, long long uniq, bool canChange){
        if(idx == S.size())
            return 1;
        long long key = (idx << 27) | (uniq << 1) | (canChange);
        
        if(dp.find(key)!=dp.end())
            return dp[key];

        int newUniq = uniq | 1 << (S[idx]-'a');
        int cntUniqs = __builtin_popcount(newUniq);
        int result = 0;

        if(cntUniqs > K){
            result = 1 + solve(idx+1, 1 << (S[idx]-'a'), canChange);
        }
        else{
            result = solve(idx+1, newUniq, canChange);
        }

        if(canChange){
            for(int ch=0; ch<26; ch++){
                int changedUniq = uniq | 1 << ch;
                int changedCntUniqs = __builtin_popcount(changedUniq);

                if(changedCntUniqs > K){
                    result = max(result, 1 + solve(idx+1, 1 << ch, false));
                }
                else{
                    result = max(result, solve(idx+1, changedUniq, false));
                }
            }
        }
        dp[key] = result;
        return dp[key];
    }

    int maxPartitionsAfterOperations(string s, int k) {
        unordered_map<long long, int>dp;
        S = s;
        K = k;
        return solve(0,0,true);
    }
};