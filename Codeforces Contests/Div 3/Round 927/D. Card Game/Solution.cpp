#include <bits/stdc++.h>
using namespace std;

void solve(vector<int>&v, string str, vector<int>& ans, int n, int m){
    int left = 0, right = n-1;
    for(int i=0; i<n-1; i++){
        if(str[i] == 'L')
            left++;
        else
            right--;
    }
    int val = v[left];
    ans[n-1] = val % m;

    for(int i=n-2; i>=0; i--){
        val = ans[i+1];
        if(str[i] == 'L'){
            left--;
            val *= v[left];
        }
        else{
            right++;
            val *= v[right];
        }
        ans[i] = val % m;
    }
}

int main(){

    int t;
    cin>>t;
    for(int i=0; i<t; i++){
        int n, m;
        cin>>n>>m;
        
        vector<int>v(n);
        string str;
        for(int j=0; j<n; j++){
            cin>>v[j];
        }
        cin>>str;
        vector<int>ans(n);
        solve(v,str,ans,n, m);
        for(int k=0; k<n; k++){
            cout<<ans[k]<<" ";
        }
        cout<<endl;
    }

return 0;
}