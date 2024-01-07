#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maximumSetSize(vector<int>& nums1, vector<int>& nums2) {
        set<int>s1;     //s1 will contain all the unique elements of nums1
        set<int>s2;     //s2 will contain all the unique elements of nums2
        set<int>common;     //it will contain all the common elements which contains both in s1 and s2

        int m = nums1.size()/2, ans = 0;
        for(int i=0; i<nums1.size(); i++){
            s1.insert(nums1[i]);
        }
        for(int i=0; i<nums2.size(); i++){
            s2.insert(nums2[i]);
        }
        
        //Making the set s1 intersection s2
        for(auto x: s1){
            if(s2.find(x) != s2.end()){
                common.insert(x);
            }
        }
        
        int sz1 = s1.size(), sz2 = s2.size(), sz3 = common.size();
        ans += min(m, sz1-sz3);     
        ans += min(m, sz2-sz3);
        
        ans = min(m*2, ans+sz3);
        return ans;
    }
};