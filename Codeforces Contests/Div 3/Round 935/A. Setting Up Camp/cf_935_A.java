import java.util.*;

public class cf_935_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int ans = a;

            int val = b%3;
            if(val != 0) val = 3 - val;
            if(c<val) {
                System.out.println(-1);
                continue;
            }

            ans += (b+c)/3;

            if((b+c)%3 != 0) ans++;
            System.out.println(ans);
        }
        sc.close();
    }
}
