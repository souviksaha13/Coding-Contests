class Solution {
    public static long numOfWays(int n) {
        // code here
        if(n%2 != 0) return 0;
        n = n/2;
        
        if(n%2 == 0) return (n/2-1)*6;
        else return (n/2)*6;
    }
}
   