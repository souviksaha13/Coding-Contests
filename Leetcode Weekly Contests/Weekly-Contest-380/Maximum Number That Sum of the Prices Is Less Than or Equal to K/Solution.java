class Solution {
    public long findMaximumNumber(long k, int x) {
        long lo = (long)0, hi = (long)(1e17);
        // long ans = 0;
        
        while(lo <= hi) {
            long mid = (lo + hi)/2;
            long bits = 0;
            // System.out.println(mid);
            
            for(long i = 1; i<= 61; i++) {
                if((i)%x == 0) {
                    long denominator = (long)1 << (i);
                    long packets = (mid+1)/denominator;
                    bits += packets*(denominator/2);
                    // if(bits >= (long)1e15) break;
                    bits += Math.max((long)0, (mid+1)%denominator - denominator/2);
                    // if(bits >= (long)1e15) break;
                }
            }
            // System.out.println(bits);
            if(bits <= k) lo = mid+1;
            else hi = mid - 1;
        }
        
        return hi;
    }
}