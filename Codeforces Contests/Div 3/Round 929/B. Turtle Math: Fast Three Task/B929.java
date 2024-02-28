import java.util.Scanner;

public class B929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int ones = 0, twos = 0;
            int sum = 0;
            int ans = -1;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if(val%3 == 1) ones++;
                else if(val%3 == 2) twos++;
                sum += val%3;
            }

            if(sum%3 == 0) ans = 0;
            else {
                twos = twos%3;

                if(ones == 0 && twos == 2) ans = 2;
                else ans = 1;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
