import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                mini = Math.min(mini, val);
                maxi = Math.max(maxi, val);
            }
            System.out.println((maxi-mini)*(n-1));
        }

        sc.close();
    }
}