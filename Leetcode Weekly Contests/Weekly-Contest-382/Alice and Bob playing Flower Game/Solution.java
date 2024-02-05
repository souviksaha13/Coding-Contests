class Solution {
    public long flowerGame(int n, int m) {
        int nodd = (n/2);
        int neven = (n/2);
        int modd = (m/2);
        int meven = (m/2);
        
        if(n%2 != 0) nodd++;
        if(m%2 != 0) modd++;
        
        return (1l * nodd * meven) + (1l * neven * modd);
    }
}