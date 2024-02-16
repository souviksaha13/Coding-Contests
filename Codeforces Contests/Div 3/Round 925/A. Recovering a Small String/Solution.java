import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int num = sc.nextInt();
            String ans = "";

            if(num >= 28) {
                ans = "z";
                num -= 26;
            } else {
                char val = (char)(num-3 + 'a');
                ans = "aa" + val;
                System.out.println(ans);
                continue;
            }

            if(num >= 27) {
                ans = "z" + ans;
                num -= 26;
            } else {
                char val = (char)(num-2 + 'a');
                ans = "a" + val + ans;
                System.out.println(ans);
                continue;
            }

            char val = (char)(num-1 + 'a');
            ans = val + ans;
            System.out.println(ans);
        }

        sc.close();
    }    
}