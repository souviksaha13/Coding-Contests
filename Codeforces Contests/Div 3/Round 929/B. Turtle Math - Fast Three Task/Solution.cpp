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

        int sum = 0, cnt1 = 0;
        for(int j=0; j<n; j++){
            sum += v[j];
            if(v[j] % 3 == 1)
                cnt1++;
            sum %= 3;
        }
        if(sum == 1){
            if(cnt1 > 0)
                cout<<1<<endl;
            else
                cout<<2<<endl;
        }
        else if(sum == 2){
            cout<<1<<endl;
        }
        else{
            cout<<0<<endl;
        }
        
    }
return 0;
}