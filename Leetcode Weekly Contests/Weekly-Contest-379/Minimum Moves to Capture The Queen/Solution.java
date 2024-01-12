class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // if rook and queen are on same vertical/horizontal line
        if(a == e) {
            if(c == e) {
                if((d>b && d>f) || (d<b && d<f)) return 1;
                else return 2;
            }
            else return 1;
        }
        
        if(b == f) {
            if(d == f) {
                if((c>a && c>e) || (c<a && c<e)) return 1;
                else return 2;
            }
            else return 1;
        }
        
        // check for bishop
        int dif = Math.abs(c-e);
        if((d+dif == f) || (d-dif) == f) {
            //check if rook is in same diagonal
            int difq = Math.abs(a-e);
            int difb = Math.abs(a-c);
            if(((b+difq == f) || b-difq == f) && ((b+difb == d) || (b-difb == d))) {
                // rook is in same diagonal
                // now check if rook is in middle of them
                if((a>c && a>e) || (a<c && a<e)) return 1;
                else return 2;
            }
            else return 1;
        }
        
        
        return 2;
    }
}