class Solution {
    int dist(char a, char b) {
        if(a>b) {
            char temp = a;
            a = b;
            b = temp;
        }
        
        int val1 = b-a;
        int val2 = ('z'-b) + (a-'a'+1);
        
        return Math.min(val1, val2);
    }
    
    public String getSmallestString(String s, int k) {
        char[] arr = s.toCharArray();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            if(arr[i] == 'a') continue;
            
            int dist = dist('a', arr[i]);
            if(dist <= k) {
                arr[i] = 'a';
                k -= dist;
            }
            
            else {
                arr[i] = (char)(arr[i]-k);
                k = 0;
            }
            
            if(k==0) break;
        }
        
        String ans = new String(arr);
        
        return ans;
    }
}
