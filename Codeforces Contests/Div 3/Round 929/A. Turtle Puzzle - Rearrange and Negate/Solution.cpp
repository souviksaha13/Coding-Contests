#include <bits/stdc++.h>
using namespace std;

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
        int sum = 0;
        for(int j=0; j<n; j++){
            sum += abs(v[j]);
        }
        cout<<sum<<endl;
    }

return 0;
}