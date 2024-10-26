import java.util.Scanner;

public class maxPlusSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int ans = n/2;

            if(n%2 == 0) {
                // ans += n/2;
                int maxi = Integer.MIN_VALUE;
                for(int i=0; i<n; i++) {
                    int val = sc.nextInt();
                    maxi = Math.max(maxi, val);
                }

                ans += maxi;
            }
            else {
                // ans += n/2;
                int maxi = Integer.MIN_VALUE;
                for(int i=0; i<n; i++) {
                    int val = sc.nextInt();
                    if(i%2 == 0) val++;
                    maxi = Math.max(maxi, val);
                }

                ans += maxi;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
