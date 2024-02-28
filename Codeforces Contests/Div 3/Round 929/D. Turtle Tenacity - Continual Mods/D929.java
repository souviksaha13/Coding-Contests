import java.util.Arrays;
import java.util.Scanner;

public class D929 {
    static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int gcd = 0;
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                gcd = gcd(gcd, arr[i]);
            }

            Arrays.sort(arr);
            if(arr[0] != arr[1]) System.out.println("YES");
            else if(gcd < arr[0]) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
