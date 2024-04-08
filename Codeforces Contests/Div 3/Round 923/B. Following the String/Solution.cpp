#include <bits/stdc++.h>
using namespace std;

string solve(vector<int>&v, int n){
    map<char,int>mp;
    char ch = 'a';
    string ans = "";
    for(int i=0; i<n; i++){
        if(v[i] == 0){
            mp[ch]++;
            ans += ch;
            ch++;
        }
        else{
            for(auto it:mp){
                if(it.second == v[i]){
                    mp[it.first]++;
                    ans += it.first;
                    break;
                }
            }
        }
    }
    return ans;
}

int main(){
    int n;
    cin>>n;
    for(int i=0; i<n; i++){
        int sz;
        cin>>sz;
        vector<int>v(sz);
        for(int j=0; j<sz; j++){
            cin>>v[j];
        }
        cout<<solve(v,sz)<<endl;
    }

return 0;
}