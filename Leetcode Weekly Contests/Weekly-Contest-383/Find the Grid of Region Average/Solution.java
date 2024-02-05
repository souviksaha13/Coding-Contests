class Solution {
    public boolean checkAdjacency(int[][] image, int sr, int sc, int thres) {
        if(Math.abs(image[sr][sc] - image[sr+1][sc]) > thres) return false;
        if(Math.abs(image[sr][sc] - image[sr][sc+1]) > thres) return false;
        
        if(Math.abs(image[sr+1][sc+1] - image[sr][sc+1]) > thres) return false;
        if(Math.abs(image[sr+1][sc+1] - image[sr+1][sc]) > thres) return false;
        if(Math.abs(image[sr+1][sc+1] - image[sr+1][sc+2]) > thres) return false;
        if(Math.abs(image[sr+1][sc+1] - image[sr+2][sc+1]) > thres) return false;
        
        if(Math.abs(image[sr+2][sc] - image[sr+1][sc]) > thres) return false;
        if(Math.abs(image[sr+2][sc] - image[sr+2][sc+1]) > thres) return false;
        
        if(Math.abs(image[sr][sc+2] - image[sr][sc+1]) > thres) return false;
        if(Math.abs(image[sr][sc+2] - image[sr+1][sc+2]) > thres) return false;
        
        if(Math.abs(image[sr+2][sc+2] - image[sr+2][sc+1]) > thres) return false;
        if(Math.abs(image[sr+2][sc+2] - image[sr+1][sc+2]) > thres) return false;
        
        return true;
    }
    
    public int[][] resultGrid(int[][] image, int threshold) {
        int m = image.length;
        int n = image[0].length;
        // System.out.println(m + " " + n);
        int[][] ans = new int[m][n];
        int[][] vis = new int[m][n];
        
        
        for(int row=0; row<m-2; row++) {
            for(int col=0; col<n-2; col++) {
                // now we check if the 3x3 grid is a region or not
                if(!checkAdjacency(image, row, col, threshold)) continue;
                
                int val = 0;
                for(int i=0; i<=2; i++) {
                    for(int j=0; j<=2; j++) {
                        val += image[row+i][col+j];
                    }
                } 
                val /= 9;
                
                for(int i=0; i<=2; i++) {
                    for(int j=0; j<=2; j++) {
                        ans[row+i][col+j] += val;
                        
                        vis[row+i][col+j]++;
                    }
                }
            }
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(vis[i][j] == 0) ans[i][j] = image[i][j];
                else ans[i][j] /= vis[i][j];
            }
        }
        
        return ans;
    }
}
