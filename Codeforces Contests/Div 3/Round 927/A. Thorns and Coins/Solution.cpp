#include <bits/stdc++.h>
using namespace std;

// int solve(int i, vector<char>&v, int n, vector<int>& dp){
//     if(i >= n)
//         return 0;
//     if(v[i] == '*')
//         return 0;
//     if(v[i] == '.')
//         return max(solve(i+1,v,n,dp), solve(i+2,v,n,dp));
//     return 1+max(solve(i+1,v,n,dp), solve(i+2,v,n,dp));

// }

int main(){

    int t;
    cin>>t;
    for(int i=0; i<t; i++){
        int n;
        cin>>n;
        vector<char>v(n);
        for(int j=0; j<n; j++){
            cin>>v[j];
        }
        
        int ans = 0;
        bool flag = true;
        for(int i=0; i<n-1; i++){
            if(v[i] == '*' && v[i] == v[i+1]){
                flag = false;
                break;
            }
            if(v[i] == '@')
                ans++;
        }
        if(v[n-1] == '@' && flag == true)
            ans++;
        cout<<ans<<endl;
    }

return 0;
}