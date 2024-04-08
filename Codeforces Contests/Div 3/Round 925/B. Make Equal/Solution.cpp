#include <bits/stdc++.h>
using namespace std;

string solve(vector<int>&v){
    if(v.size() == 1)
        return "YES";
    int sum = 0;
    for(int i=0; i<v.size(); i++){
        sum += v[i];
    }
    int val = sum/(v.size()), cnt = 1;
    int rightSum = 0;
    for(int i=v.size()-1; i>=0; i--){
        rightSum += v[i];
        // cout<<(double)rightSum/cnt<<endl;
        if((double)rightSum/cnt > val){
            return "NO";
        }
        cnt++;
    }
    return "YES";
}

int main(){
    int t;
    cin>>t;
    for(int i=0; i<t; i++){
        int n;
        cin>>n;
        vector<int>v(n);
        for(int j=0; j<n; j++){
            cin>>v[j];
        }
        cout<<solve(v)<<endl;
    }

return 0;
}