import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Solution {

    static int find(int n, int[] arr) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(arr);

        ls.add(arr[0]);
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[i-1]) ls.add(arr[i]);
        }
        int val = 1;
        int st = 0, end = 1;

        while(end < ls.size()) {
            while((ls.get(end) - ls.get(st)) >= n) st++;
            val = Math.max(val, end-st+1);
            end++;
        }

        return val;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(find(n, arr));
        }

        sc.close();
    }
}
