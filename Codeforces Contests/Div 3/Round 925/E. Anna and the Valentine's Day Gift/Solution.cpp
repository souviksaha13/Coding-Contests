#include <bits/stdc++.h>
using namespace std;

string solve(vector<int>&v, int n, int m){
    int digits = 0;
    vector<int>zeroes;

    for(int i=0; i<n; i++){
        bool flag = true;
        int zeroCnt = 0;
        while(v[i] > 0){
            if(v[i]%10 == 0 && flag){
                zeroCnt++;
            }
            else{
                flag = false;
            }
            v[i]/=10;
            digits++;
        }
        if(zeroCnt > 0)
            zeroes.push_back(zeroCnt);
    }
    sort(zeroes.begin(), zeroes.end());
    for(int i=zeroes.size()-1; i>=0; i-=2){
        digits -= zeroes[i];
    }
    if(digits > m)
        return "Sasha";
    return "Anna";
}

int main(){
    int t;
    cin>>t;
    for (int i = 0; i < t; i++)
    {
        int n,m;
        cin>>n>>m;
        vector<int>v(n);
        for (int j = 0; j < n; j++)
        {
            cin>>v[j];
        }
        cout<<solve(v,n,m)<<endl;
    }
    

return 0;
}