import java.util.*;

class Solution {
    
    boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to sqrt(n) 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
    
    public int mostFrequentPrime(int[][] mat) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int row = i, col = j;
                int val = mat[i][j];
                
                // east
                col++;
                while(col<m) {
                    val = val*10 + mat[row][col++];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // west
                val = mat[i][j];
                col = j-1;
                while(col>=0) {
                    val = val*10 + mat[row][col--];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // north
                val = mat[i][j];
                col = j;
                row--;
                while(row>=0) {
                    val = val*10 + mat[row--][col];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // south
                val = mat[i][j];
                row = i+1;
                while(row<n) {
                    val = val*10 + mat[row++][col];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // north-east
                val = mat[i][j];
                row = i-1;
                col = j+1;
                
                while(row>=0 && col<m) {
                    val = val*10 + mat[row--][col++];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // north-west
                val = mat[i][j];
                row = i-1;
                col = j-1;
                while(row>=0 && col>=0) {
                    val = val*10 + mat[row--][col--];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // south-east
                val = mat[i][j];
                row = i+1;
                col = j+1;
                while(row<n && col<m) {
                    val = val*10 + mat[row++][col++];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
                
                // south-west
                val = mat[i][j];
                row = i+1;
                col = j-1;
                while(row<n && col>=0) {
                    val = val*10 + mat[row++][col--];
                    if(mp.containsKey(val)) mp.put(val, mp.get(val)+1);
                    else if(isPrime(val)) mp.put(val, 1);
                }
            }
        }
        
        int ans = -1;
        int freq = 0;
        for(Map.Entry<Integer, Integer> map : mp.entrySet()) {
            if(map.getValue() > freq) {
                ans = map.getKey();
                freq = map.getValue();
            }
            else if(map.getValue() == freq) ans = Math.max(ans, map.getKey());
        }
        
        return ans;
    }
}