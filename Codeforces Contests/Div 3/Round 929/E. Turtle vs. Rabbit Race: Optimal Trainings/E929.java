import java.util.Scanner;

public class E929 {
    static int binarySearch(int lo, int hi, int[] arr, int u, int diff, int n) {
        int loval = lo;
        while(lo<=hi) {
            int mid = (lo+hi)/2;
            if((arr[mid]-diff) > u) hi = mid-1;
            else lo = mid+1;
        }
        if(lo == n) return lo;
        if(lo==0) return 1;
        u = u - arr[lo-1]+diff;
        int value = arr[lo]-arr[lo-1];
        // System.out.println("u" + u + " " + "value" + " " + value);
        if(value%2 == 0) {
            if(u >= value/2) lo++;
        }
        else {
            if(u > value/2) lo++;
        }
        if(loval == lo) lo++;
        return lo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] prefixSum = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(i==0) prefixSum[0] = arr[0];
                else prefixSum[i] = prefixSum[i-1] + arr[i];
            }

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt()-1;
                int u = sc.nextInt();

                int diff = 0;
                if(l>0) diff = prefixSum[l-1];
                int val = binarySearch(l, n-1, prefixSum, u, diff, n);
                if(val == l) val++;
                System.out.print(val);
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
