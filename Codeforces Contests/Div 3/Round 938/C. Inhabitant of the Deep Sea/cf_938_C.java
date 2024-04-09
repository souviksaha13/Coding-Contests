import java.util.Scanner;

public class cf_938_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] arr = new int[n];
            int left = 0, right = n-1;
            long totalSum = 0l;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                totalSum += arr[i];
            }

            if(totalSum <= k) {
                System.out.println(n);
                continue;
            }

            long sum = 1l * arr[0];

            while((2*sum-1) <= k) {
                left++;
                sum += arr[left];
            }

            sum = 1l * arr[right];
            while((2*sum) <= k) {
                right--;
                sum += arr[right];
            }

            System.out.println(n-(right-left+1));
        }

        sc.close();
    }
}
