#include <bits/stdc++.h>
using namespace std;

string solve(int n){
    vector<string> dict = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    string ans = "";

    if(n <= 28){
        ans += "aa";
        ans += dict[n-2-1];
        return ans;
    }
    else if(n > 28 && n <= 53){
        ans += "a";
        n--;
        n-=26;
        ans += dict[n-1];
        ans += "z";
    }
    else{
        n -= 52;
        ans += dict[n-1];
        ans += "zz";
    }

    return ans;
}


int main(){
    int t;
    cin>>t;
    for(int i=0; i<t; i++){
        int n;
        cin>>n;
        cout<<solve(n)<<endl;
    }

return 0;
}