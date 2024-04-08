#include <bits/stdc++.h>
using namespace std;

bool solve(vector<string>&v, char& trump, vector<vector<string>>&ans){
    vector<int>clubs;
    vector<int>hearts;
    vector<int>diam;
    vector<int>spades;

    for(int i=0; i<v.size(); i++){
        if(v[i][1] == 'C')
            clubs.push_back(v[i][0] - '0');
        if(v[i][1] == 'H')
            hearts.push_back(v[i][0] - '0');
        if(v[i][1] == 'D')
            diam.push_back(v[i][0] - '0');
        if(v[i][1] == 'S')
            spades.push_back(v[i][0] - '0');
    }


    //All even cards apart from trump cards are utilised, and pushed in ans
    if(trump != 'C' && clubs.size() > 1){
        sort(clubs.begin(), clubs.end(), greater<int>());
        int i = clubs.size()-1;
    
        while(i >= 1){
            ans.push_back({to_string(clubs[i])+"C", to_string(clubs[i-1])+"C"});
            clubs.pop_back();
            clubs.pop_back();
            i-=2;
        }
    }
    if(trump != 'H' && hearts.size() > 1){
        sort(hearts.begin(), hearts.end(), greater<int>());
        int i = hearts.size()-1;
    
        while(i >= 1){
            ans.push_back({to_string(hearts[i])+"H", to_string(hearts[i-1])+"H"});
            hearts.pop_back();
            hearts.pop_back();
            i-=2;
        }
    }
    if(trump != 'D' && diam.size() > 1){
        sort(diam.begin(), diam.end(), greater<int>());
        int i = diam.size()-1;
    
        while(i >= 1){
            ans.push_back({to_string(diam[i])+"D", to_string(diam[i-1])+"D"});
            diam.pop_back();
            diam.pop_back();
            i-=2;
        }
    }
    if(trump != 'S' && spades.size() > 1){
        sort(spades.begin(), spades.end(), greater<int>());
        int i = spades.size()-1;
    
        while(i >= 1){
            ans.push_back({to_string(spades[i])+"S", to_string(spades[i-1])+"S"});
            spades.pop_back();
            spades.pop_back();
            i-=2;
        }
    }


    //Considering the trump card
    if(trump == 'C'){
        sort(clubs.begin(), clubs.end(), greater<int>());
        int cnt = 0;
        if(hearts.size() > 0) cnt++;
        if(diam.size() > 0) cnt++;
        if(spades.size() > 0) cnt++;

        if(cnt > clubs.size())
            return false;
        else{
            if(hearts.size()!=0){
                ans.push_back({to_string(hearts[0])+"H", to_string(clubs.back())+"C"});
                clubs.pop_back();
            }
            if(diam.size()!=0){
                ans.push_back({to_string(diam[0])+"D", to_string(clubs.back())+"C"});
                clubs.pop_back();
            }
            if(spades.size()!=0){
                ans.push_back({to_string(spades[0])+"S", to_string(clubs.back())+"C"});
                clubs.pop_back();
            }
            if(clubs.size()%2 != 0)
                return false;
            if(clubs.size() != 0){
                for(int i=0; i<clubs.size()-1; i++){
                    ans.push_back({to_string(clubs[i+1])+"C", to_string(clubs[i])+"C"});
                }
            }
        }
    }
    if(trump == 'H'){
        sort(hearts.begin(), hearts.end(), greater<int>());
        int cnt = 0;
        if(clubs.size() > 0) cnt++;
        if(diam.size() > 0) cnt++;
        if(spades.size() > 0) cnt++;

        if(cnt > hearts.size())
            return false;
        else{
            if(clubs.size()!=0){
                ans.push_back({to_string(clubs[0])+"C", to_string(hearts.back())+"H"});
                hearts.pop_back();
            }
            if(diam.size()!=0){
                ans.push_back({to_string(diam[0])+"D", to_string(hearts.back())+"H"});
                hearts.pop_back();
            }
            if(spades.size()!=0){
                ans.push_back({to_string(spades[0])+"S", to_string(hearts.back())+"H"});
                hearts.pop_back();
            }
            if(hearts.size()%2 != 0)
                return false;
            if(hearts.size() != 0){
                for(int i=0; i<hearts.size()-1; i++){
                    // cout<<hearts[i]<<" "<<hearts[i+1]<<endl;
                    ans.push_back({to_string(hearts[i+1])+"H", to_string(hearts[i])+"H"});
                }
            }
        }
    }
    if(trump == 'D'){
        sort(diam.begin(), diam.end(), greater<int>());
        int cnt = 0;
        if(hearts.size() > 0) cnt++;
        if(clubs.size() > 0) cnt++;
        if(spades.size() > 0) cnt++;

        if(cnt > diam.size())
            return false;
        else{
            if(hearts.size()!=0){
                ans.push_back({to_string(hearts[0])+"H", to_string(diam.back())+"D"});
                diam.pop_back();
            }
            if(clubs.size()!=0){
                ans.push_back({to_string(clubs[0])+"C", to_string(diam.back())+"D"});
                diam.pop_back();
            }
            if(spades.size()!=0){
                ans.push_back({to_string(spades[0])+"S", to_string(diam.back())+"D"});
                diam.pop_back();
            }
            if(diam.size()%2 != 0)
                return false;
            if(diam.size() != 0){
                for(int i=0; i<diam.size()-1; i++){
                    ans.push_back({to_string(diam[i+1])+"D", to_string(diam[i])+"D"});
                }
            }
        }
    }
    if(trump == 'S'){
        sort(spades.begin(), spades.end(), greater<int>());
        int cnt = 0;
        if(hearts.size() > 0) cnt++;
        if(diam.size() > 0) cnt++;
        if(clubs.size() > 0) cnt++;

        if(cnt > spades.size())
            return false;
        else{
            if(hearts.size()!=0){
                ans.push_back({to_string(hearts[0])+"H", to_string(spades.back())+"S"});
                spades.pop_back();
            }
            if(diam.size()!=0){
                ans.push_back({to_string(diam[0])+"D", to_string(spades.back())+"S"});
                spades.pop_back();
            }
            if(clubs.size()!=0){
                ans.push_back({to_string(clubs[0])+"C", to_string(spades.back())+"S"});
                spades.pop_back();
            }

            if(spades.size()%2 != 0)
                return false;
            if(spades.size() != 0){
                for(int i=0; i<spades.size()-1; i++){
                    ans.push_back({to_string(spades[i+1])+"S", to_string(spades[i])+"S"});
                }
            }
        }
    }

    return true;

}

int main(){
    int t;
    cin>>t;
    for(int i=0; i<t; i++){
        int n;
        cin>>n;
        char m;
        cin>>m;
        int sz = n+n;
        vector<string>v(sz);
        for(int j=0; j<sz; j++){
            cin>>v[j];
        }
        vector<vector<string>>ans;
        if(solve(v,m,ans)){
            for(int k=0; k<n; k++){
                cout<<ans[k][0]<<" "<<ans[k][1]<<endl;
            }
        }
        else
            cout<<"IMPOSSIBLE"<<endl;
    }
return 0;
}