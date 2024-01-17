#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> beautifulIndices(string s, string a, string b, int k) {
        vector<int>LPSa(a.size());
        vector<int>LPSb(b.size());

        //finding longest prefix suffix for pattern a
        int currLength = 0;
        LPSa[0] = 0;
        for(int i=1; i<a.size(); i++){
            while((currLength > 0) && (a[i] != a[currLength])){
                currLength--;
            }
            if(a[i] == a[currLength]){
                currLength++;
                LPSa[i] = currLength;
            }
            else{
                LPSa[i] = 0;
            }
        }

        //finding longest prefix suffix for pattern b
        currLength = 0;
        LPSb[0] = 0;
        for(int i=1; i<b.size(); i++){
            while((currLength > 0) && (b[i] != b[currLength])){
                currLength--;
            }
            if(b[i] == b[currLength]){
                currLength++;
                LPSb[i] = currLength;
            }
            else{
                LPSb[i] = 0;
            }
        }

        //placing the first indexes of a in indexA vector
        vector<int>indexA;
        int i=0, j=0;       //i will traverse s and j will traverse a
        while(i<s.size()){
            if(j == a.size()){
                indexA.push_back(i-j);
                j = LPSa[j-1];
            }
            while(j>0 && s[i]!=a[j]){
                j = LPSa[j-1];
            }
            if(s[i] == a[j]){
                j++;
            }
            i++;
        }
        if(j == a.size()){
            indexA.push_back(i-j);
        }

        //placing the first indexes of b in indexB vector
        vector<int>indexB;
        i=0; j=0;       //i will traverse s and j will traverse b
        while(i<s.size()){
            //if b is found in s, push the index from where b is found
            //& then update j with the LPS value of the last index
            if(j == b.size()){
                indexB.push_back(i-j);
                j = LPSb[j-1];
            }
            while(j>0 && s[i]!=b[j]){
                j = LPSb[j-1];
            }
            if(s[i] == b[j]){
                j++;
            }
            i++;
        }
        if(j == b.size()){
            indexB.push_back(i-j);
        }

        vector<int>ans;
        i=0; j=0;
        // for(int i=0; i<indexA.size(); i++)
        //     cout<<indexA[i]<<" ";
        // cout<<endl;
        // for(int i=0; i<indexB.size(); i++)
        //     cout<<indexB[i]<<" ";

        while(i<indexA.size() && j<indexB.size()){
            if(abs(indexA[i] - indexB[j]) <= k){
                ans.push_back(indexA[i]);
                i++;
            }
            else{
                if(indexA[i] > indexB[j])
                    j++;
                else
                    i++;
            }
        }
        return ans;
    }
};