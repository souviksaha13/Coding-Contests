import java.util.Scanner;

public class cf_938_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(n==1) {
                System.out.println(a);
                continue;
            }

            int price = 0;

            if(b < (2*a)) {
                price += b*(n/2);
                if(n%2 != 0) price += a;
            }
            else {
                price += a*n;
            }

            System.out.println(price);
        }

        sc.close();
    }
}
