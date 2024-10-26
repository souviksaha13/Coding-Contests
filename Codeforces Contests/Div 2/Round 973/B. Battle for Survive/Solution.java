import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i=0; i<n; i++) arr[i] = 1l* sc.nextInt();

            long val = arr[n-2];
            for(int i=0; i<n-2; i++) {
                val -= arr[i];
            }

            System.out.println(arr[n-1]-val);
        }
    }
}
