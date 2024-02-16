import java.util.*;

public class Solution {
    static int find(int n, int[] arr) {
        int left = 1, right = 1;

        for(int i=1; i<n; i++) {
            if(arr[i] == arr[i-1]) left++;
            else break;
        }

        for(int i=n-2; i>=0; i--) {
            if(arr[i] == arr[i+1]) right++;
            else break;
        }
        int val = Math.max(left, right);
        if(arr[0] == arr[n-1]) val = left + right;

        return Math.max(0, n-val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(find(n, arr));
        }

        sc.close();
    }
}
