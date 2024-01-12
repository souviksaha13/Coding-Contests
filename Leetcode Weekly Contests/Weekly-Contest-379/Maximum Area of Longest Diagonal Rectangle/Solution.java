class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diag = 0.0;
        int area = 0;
        
        for(int i=0; i<dimensions.length; i++) {
            double temp = Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if(temp > diag) {
                area = dimensions[i][0] * dimensions[i][1];
                diag = temp;
            }
            else if(temp == diag) {
                int val = dimensions[i][0] * dimensions[i][1];
                area = Math.max(area, val);
            }
        }
        
        return area;
    }
}