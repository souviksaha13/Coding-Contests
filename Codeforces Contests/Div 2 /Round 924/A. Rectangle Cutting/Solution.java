import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%2 == 0 && b%2 == 0) System.out.println("Yes");
            else if(a%2 != 0 && b%2 != 0) System.out.println("No");

            else {
                // a is even
                if(a%2 == 0) {
                    if(b*2 == a) System.out.println("No");
                    else System.out.println("Yes");
                }
                else {
                    if(a*2 == b) System.out.println("No");
                    else System.out.println("Yes");
                }
            }
        }

        sc.close();
    }
}
