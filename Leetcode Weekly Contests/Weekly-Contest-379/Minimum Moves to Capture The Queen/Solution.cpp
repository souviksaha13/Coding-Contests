#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // if queen and rook lies in same row and bishop is not in between them
        if((a == e) && ((c != a) || ((c == a) && (((d < b) && (d < f)) || ((d > b) && (d > f))))))
            return 1;
        
        // if queen and rook lies in same column and bishop is not in between them
        if((b == f) && ((d != b) || ((d == b) && (((c < a) && (c < e)) || ((c > a) && (c > e))))))
            return 1;
        
        // check for bishop
        int dis1 = abs(c-e);  //vertical distance between bishop and queen
        if(d-dis1 == f || d+dis1 == f){
            //Queen lies in same diagonal with the bishop
            //Check if rook lies between queen and bishop
            
            int dis2 = abs(c-a);
            if(d-dis2 == b || d+dis2 == b){
                //rook lies in same diagonal
                if((a>c && a>e) || (a<c && a<e))
                    return 1;
                else
                    return 2;
            }
            else
                return 1;
        }
        
        
        return 2;
    }
};