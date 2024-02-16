import java.util.Scanner;

public class Solution {
    static boolean find(int[] arr, long sum) {
        int n = arr.length;
        long water = sum/n;
        long reqd = 0;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i]-reqd > water) return false;
            if(arr[i] > water) reqd -= (arr[i] - water);
            else reqd += water - arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(find(arr, sum)) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}