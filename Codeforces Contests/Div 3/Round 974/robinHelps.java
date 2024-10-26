import java.util.*;

public class robinHelps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int coins = 0, ans = 0;

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                if(val >= k) {
                    coins += val;
                }
                else if((val == 0) && (coins > 0)) {
                    ans++;
                    coins--;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}