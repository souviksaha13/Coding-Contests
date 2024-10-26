import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int x = sc.nextInt(), y= sc.nextInt();

            if(x>y) {
                int val = n/y;
                if(n%y != 0) val++;
                System.out.println(val);
            }
            else {
                int val = n/x;
                if(n%x != 0) val++;
                System.out.println(val);
            }
        }

        sc.close();
    }
}
