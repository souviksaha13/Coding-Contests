#include <bits/stdc++.h>
using namespace std;

class Solution {
	public:
	int minOperations(vector<int> a, int n) {
	    int mx = -1;
        //Finding the max element first
	    for(int i=0; i<n; i++){
	        mx = max(mx, a[i]);
	    }

        //Storing the indexes of the max element
	    vector<int>v;
	    for(int i=0; i<n; i++){
	        if(a[i] == mx)
	            v.push_back(i);
	    }

        //If their is only 1 max element, than return 0. As no op. req and one criteria is fulfilled. 
	    if(v.size() == 1)
	         return 0;

        /*If multiple times max element is present than they must be present adjacent to each other.
          To find the max count of indices of the max element which are adjacent to each other.
          
          eg. v: 0 2 4 6 7 8 9  (4 is the mxCnt of adj indices, i.e, 6 7 8 9)
             o/p: v.size()-mxCnt (7-4 = 3)

          To perform operation on 0,2 and 4 indices by increasing or decreasing it, so that all indices
          of max element are adjacent to each other.
        */
	    int cnt = 1, mxCnt = 0;
	    for(int j=1; j<v.size(); j++){
	        if(v[j]-v[j-1] == 1)
	            cnt++;
	        else
	            cnt = 1;
	       mxCnt = max(mxCnt,cnt);
	    }
	    return v.size()-mxCnt;
	}
};