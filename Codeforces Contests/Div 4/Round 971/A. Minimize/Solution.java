import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int xx=0; xx<t; xx++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(b-a);
        }
        sc.close();
    }
}
