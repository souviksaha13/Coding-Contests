import java.util.*;

public class Solution {
    static void printAllValues(int[] arr, int m, String command, int n) {
        int l = 0, r = n-1;
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'L') l++;
            else r--;
        }

        int[] ans = new int[n];
        int val = 1;
        int j = 0;

        for(int i=command.length()-1; i>=0; i--) {
            if(command.charAt(i) == 'L') {
                l--;
                val = (val * arr[l]) % m;
                ans[j++] = val;
            }
            else {
                r++;
                val = (val * arr[r]) % m;
                ans[j++] = val;
            }
        }

        for(int i=ans.length-1; i>=0; i--) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m =sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            String command = sc.next();
            printAllValues(arr, m, command, n);
        }

        sc.close();
    }
}
