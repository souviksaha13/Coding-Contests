#include <bits/stdc++.h>
using namespace std;

int solve(vector<int>&v, int n){
    int left = 0, right = n-1;
    for(int i=0; i<n-1; i++){
        if(v[i] == v[i+1])
            left++;
        else
            break;
    }
    if(left == right)
        return 0;
    for(int j=n-1; j>0; j--){
        if(v[j] == v[j-1])
            right--;
        else
            break;
    }

    if(v[left] == v[right]){
        left++;
        right--;
        return (right-left+1);
    }
    return min(n-1-left, right);
    
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
        cout<<solve(v,n)<<endl;
    }

return 0;
}