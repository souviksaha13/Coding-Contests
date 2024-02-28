class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        long ans = 0l;
        
        for(int i=0; i<n-1; i++) {
            int x1 = bottomLeft[i][0];
            int y1 = bottomLeft[i][1];
            int x2 = topRight[i][0];
            int y2 = topRight[i][1];
            
            for(int j=i+1; j<n; j++) {
                long val = 0l;
                int m1 = bottomLeft[j][0];
                int n1 = bottomLeft[j][1];
                int m2 = topRight[j][0];
                int n2 = topRight[j][1];
                
                int xi = Math.max(x1, m1);
                int yi = Math.max(y1, n1);
                int xj = Math.min(x2, m2);
                int yj = Math.min(y2, n2);
                int len = Math.min((xj-xi), (yj-yi));
                
                if(xi>=xj || yi>=yj) val = 0l;
                else val = 1l * len * len;
                // System.out.println(len + " " + val + " " + xi + " " + yi + " " + xj + " " + yj);
                ans = Math.max(ans, val);
            }
        }
        
        return ans;
    }
}