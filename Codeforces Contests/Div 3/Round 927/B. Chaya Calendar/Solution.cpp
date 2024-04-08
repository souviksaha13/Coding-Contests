#include <bits/stdc++.h>
using namespace std;

int solve(vector<int>&v, int n){
    int year = v[0];
    for(int i=1; i<n; i++){
        if(year == v[i])
            year *= 2;
        else if(year > v[i]){
            int tmp = v[i]*ceil((double)year/v[i]);
            if(tmp == year){
                tmp = v[i]*(ceil((double)year/v[i])+1);
            }
            year = tmp;
        }
        else
            year = v[i];
    }
    return year;
}
// int solve(vector<int>&v, int n){
//     int year = v[0];
//     for(int i=1; i<n; i++){
//         int tmp = v[i], j = 2;
//         while(tmp <= year){
//             tmp = v[i]*j;
//             j++;
//         }
//         // cout<<year<<" ";
//         year = tmp;
//     }
//     return year;
// }

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