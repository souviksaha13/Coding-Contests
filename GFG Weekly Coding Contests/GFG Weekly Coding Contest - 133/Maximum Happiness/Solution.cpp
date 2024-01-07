#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int maxHappy(int n, vector<int> &bags, int m, vector<int> &req) {
        sort(bags.begin(), bags.end());
        sort(req.begin(), req.end());
        int ans = 0, i=0, j=0;
        
        while(i<n && j<m){
            if(bags[i] >= req[j]){
                i++;
                j++;
                ans++;
            }
            else if(bags[i] < req[j]){
                i++;
            }
        }
        return ans;
    }
};