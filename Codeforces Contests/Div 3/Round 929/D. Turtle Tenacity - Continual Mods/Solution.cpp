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

        sort(v.begin(), v.end());
        if(v[0] != v[1])
            cout<<"YES"<<endl;
        else{
            int val = 0;
            for(int j=0; j<n; j++){
                val = __gcd(val, v[j]);
            }
            if(val < v[0])
                cout<<"YES"<<endl;
            else
                cout<<"NO"<<endl;
        }
    }

return 0;
}