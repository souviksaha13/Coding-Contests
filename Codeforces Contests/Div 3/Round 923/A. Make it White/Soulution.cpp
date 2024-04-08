#include <bits/stdc++.h>
using namespace std;

int solve(string& s, int sz){
    int start = 0, end = 0;
    for(int i=0; i<sz; i++){
        if(s[i] == 'B'){
            start = i;
            break;
        }
    }
    for(int i=sz-1; i>=0; i--){
        if(s[i] == 'B'){
            end = i;
            break;
        }
    }
    return (end-start+1);
}

int main(){
    int n;
    cin>>n;
    for(int i=0; i<n; i++){
        int sz;
        cin>>sz;
        string s;
        cin>>s;
        cout<<solve(s,sz)<<endl;
    }

return 0;
}