import java.util.Scanner;

public class cf_937_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            int n = 0;
            boolean isPm = false;
            n += (arr[0]- '0')*10 + (arr[1]-'0');
            if(n==0) {
                arr[0] = '1';
                arr[1] = '2';
                String ans = new String(arr);
                ans = ans + " AM";
                System.out.println(ans);
                continue;
            }
            
            if(n>12) {
                n -= 12;
                isPm = true;
            }
            else if(n == 12) isPm = true;

            arr[1] = (char)('0' + (n%10));
            arr[0] = (char)('0' + (n/10));

            String ans = new String(arr);

            if(isPm) ans = ans + " PM";
            else ans = ans + " AM";

            System.out.println(ans);
        }

        sc.close();
    }
}
