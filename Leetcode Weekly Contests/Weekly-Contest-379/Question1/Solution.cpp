#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& d) {
        int area = 0;
        double mxD = 0.0;    //Double is necessary to take the exact decimal value

        for(int i=0; i<d.size(); i++){
            double diag = sqrt((d[i][0]*d[i][0]) + (d[i][1]*d[i][1]));
            if(diag > mxD){
                mxD = diag;     //Stores the longest diagonal
                area = d[i][0]*d[i][1];         
            }
            else if(diag == mxD){
                //If diagonals are of same length take the max area
                area = max(area, d[i][0]*d[i][1]);
            }
        }
        return area;
    }
};