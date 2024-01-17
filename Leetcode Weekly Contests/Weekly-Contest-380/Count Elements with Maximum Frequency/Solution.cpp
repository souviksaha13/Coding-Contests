#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int n = nums.size();
        map<int,int>mp;
        for(int i=0; i<n; i++){
            mp[nums[i]]++;
        }
        int mxFreq = 0;
        for(auto x:mp){
            mxFreq = max(mxFreq, x.second);
        }
        int ans = 0;
        for(auto x: mp){
            if(x.second == mxFreq){
                ans += x.second;
            }
        }
        return ans;
    }
};