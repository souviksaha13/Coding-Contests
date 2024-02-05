class Solution {
    public static String isFriend(int n, int x, int y, int[] arr) {
        // code here
        for(int el : arr) {
            if(el + x == y) return "yes";
        }
        
        return "no";
    }
}