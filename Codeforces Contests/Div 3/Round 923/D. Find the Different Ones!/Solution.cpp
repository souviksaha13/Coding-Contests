#include <bits/stdc++.h>
using namespace std;

void nextDiffElement(vector<int>&v, vector<int>&nde, int n){
    stack<int>st;

    for(int i=n-1; i>=0; i--){
        while(!st.empty() && v[i]==v[st.top()])
            st.pop();
        if(st.empty()){
            nde[i] = 1e9;
        }
        else{
            nde[i] = st.top();
        }
        st.push(i);
    }
}

int main(){
    int n;
    cin>>n;
    for(int j=0; j<n; j++){
        int sz;
        cin>>sz;
        vector<int>v(sz);
        for(int i=0; i<sz; i++){
            cin>>v[i];
        }

        vector<int>nde(sz);
        nextDiffElement(v,nde,sz);

        int querySz;
        cin>>querySz;
        for(int i=0; i<querySz; i++){
            int l,r;
            cin>>l>>r;
            if(nde[l-1] <= (r-1))
                cout<<l<<" "<<nde[l-1]+1<<endl;
            else
                cout<<"-1 -1"<<endl;
        }
    }

return 0;
}