import java.util.Scanner;

public class cf_937_D {

    static boolean isDiv(int num) {
        boolean yes = true;
        while (num != 0) {
            int val = num%10;
            num /= 10;
            if(val > 1) yes = false;
        }

        return yes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 11, 101, 111, 121, 1001, 1011, 1101, 1111, 1221, 1331, 10001,10010, 10011, 10100, 10101, 10111, 10201, 11001, 11011, 11101, 11111, 11121, 11211, 12111, 12221, 12321, 13431, 14641};

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int num = sc.nextInt();
            while (num%10 == 0) {
                num /= 10;
            }

            boolean yes = false;

            yes = isDiv(num);

            for (int el : arr) {
                if(num == el) {
                    yes = true;
                    break;
                }
            }

            if(yes) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
