import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // values changes as follows [-1,2,-3,4,-5,6,......] -> easy to determine the winner based on index

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            if(n%2 == 0) System.out.println("Sakurako");
            else System.out.println("Kosuke");
        }
        sc.close();
    }
}
