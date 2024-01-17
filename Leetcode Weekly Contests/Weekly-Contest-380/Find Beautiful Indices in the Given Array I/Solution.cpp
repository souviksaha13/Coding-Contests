#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> beautifulIndices(string s, string a, string b, int k) {
        vector<int> posa; // Vector to store indices of a
        vector<int> posb; // Vector to store indices of b

        size_t pos = s.find(a); // Find the first occurrence of a

        while (pos != std::string::npos) {
            
            posa.push_back(static_cast<int>(pos));

            // Continue searching for the substring after the last found position
            pos = s.find(a, pos + 1);
        }
        
        pos = s.find(b); // Find the first occurrence of b

        while (pos != std::string::npos) {
            
            posb.push_back(static_cast<int>(pos));

            // Continue searching for the substring after the last found position
            pos = s.find(b, pos + 1);
        }
        
        int i=0, j=0;
        vector<int>ans;
        while(i < posa.size() && j < posb.size()){
            if(abs(posa[i] - posb[j]) <= k){
                ans.push_back(posa[i]);
                i++;
            }
            else{
                if(posa[i] > posb[j])
                    j++;
                else
                    i++;
            }
        }
        return ans;
    }
};