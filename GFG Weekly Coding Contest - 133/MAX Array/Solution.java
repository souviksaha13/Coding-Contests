import java.util.*;

class Solution{
    
    int minOperations(int a[], int N) 
    { 
        // Code here
        int maxi = a[0];
        int freq = 1;
        
        for(int i=1; i<N; i++) {
            if(a[i] > maxi) {
                maxi = a[i];
                freq = 1;
            }
            else if(a[i] == maxi) freq++;
        }
        
        if(freq == 1) return 0;
        
        List<Integer> ls = new ArrayList<>();
        int cntFreq = 0;
        
        for(int i=0; i<N; i++) {
            if(a[i] == maxi) cntFreq++;
            else {
                if(cntFreq != 0) {
                    ls.add(cntFreq);
                    cntFreq = 0;
                }
            }
        }
        
        if(cntFreq != 0) ls.add(cntFreq);
        
        if(ls.size() == 1) return 0;
        
        Collections.sort(ls);
        int ans = 0;
        
        for(int i=0; i<ls.size()-1; i++) {
            ans += ls.get(i);
        }
        
        return ans;
    } 
}
