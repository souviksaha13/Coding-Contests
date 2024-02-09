import java.util.Scanner;

public class Solution {
    static void formPermutation(int n, int k, int[] ans) {
        int cnt = 0, val = 1, i = 0;

        while(cnt < n) {
            ans[i] = val++;
            cnt++;

            if(i%2 == 0) {
                if(i+k < n) i += k;

                else i++;
                if(i == n) i -= k;
            }
            else {
                if(i-k >= 0) i-=k;
                else i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] ans = new int[n];

            formPermutation(n, k, ans);

            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
