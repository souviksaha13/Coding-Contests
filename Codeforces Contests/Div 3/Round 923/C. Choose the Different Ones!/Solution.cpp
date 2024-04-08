#include <bits/stdc++.h>
using namespace std;

string solve(set<int>&set1, set<int>&set2, int n, int m, int k){
    int cnt1 = 0, cnt2 = 0;
    for(int i=1; i<=k; i++){
        if(!set1.count(i) && !set2.count(i))
            return "NO";
        else if(set1.count(i) && !set2.count(i))
            cnt1++;
        else if(!set1.count(i) && set2.count(i))
            cnt2++;
    }
    if(cnt1 > k/2 || cnt2 > k/2)
        return "NO";
    return "YES";
}

int main(){
    int n;
    cin>>n;
    for(int i=0; i<n; i++){
        int n, m, k;
        cin>>n>>m>>k;
        set<int>set1;
        set<int>set2;
        for(int j=0; j<n; j++){
            int tmp;
            cin>>tmp;
            set1.insert(tmp);
        }
        for(int j=0; j<m; j++){
            int tmp;
            cin>>tmp;
            set2.insert(tmp);
        }
        cout<<solve(set1,set2,n,m,k)<<endl;
    }

return 0;
}