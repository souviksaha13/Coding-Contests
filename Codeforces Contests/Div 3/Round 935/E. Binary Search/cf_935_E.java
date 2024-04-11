import java.util.*;

public class cf_935_E {

    static void souvikPrint(int n, int[] arr, int x) {
        // base case: 1
        if(x==1) {
            if(arr[0] == 1) {
                System.out.println(0);
                return;
            }
            else {
                int idx = 0;

                for(int i=0; i<n; i++) {
                    if(arr[i] == 1) idx = i+1;
                }

                System.out.println(1);
                System.out.println(1 + " " + idx);
                return;
            }
        }

        int lo = 0, hi = n;
        boolean isXvisited = false;
        while ((hi-lo) != 1) {
            int mid = (lo+hi)/2;
            if(arr[mid]<=x) lo = mid;
            else hi = mid;
            if(arr[mid] == x) isXvisited = true;
        }

        if(arr[lo] == x) System.out.println(0);

        else if(!isXvisited) {
            int idx = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] == x) idx = i+1;
            }

            System.out.println(1);
            System.out.println((idx) + " " + (lo+1));
        }

        else {
            int idx = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] == x) idx = i+1;
            }

            System.out.println(1);
            System.out.println((lo+1) + " " + idx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            souvikPrint(n, arr, x);
        }

        sc.close();
    }
}
