import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int wait = 0;

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                int val = arr[i];
                while (val <= wait) {
                    val = ((wait/val)+1)*val;
                    // val += arr[i];
                }
                wait = val;
                // System.out.print(wait + " ");
            }

            System.out.println(wait);
        }

        sc.close();
    }
}
