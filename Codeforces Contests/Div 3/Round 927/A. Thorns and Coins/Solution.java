import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String str = sc.next();

            int ans = 0;
            int throne = 0;

            for(int i=0; i<n; i++) {
                if(str.charAt(i) == '.') throne = 0;
                else if(str.charAt(i) == '@') {
                    ans++;
                    throne = 0;
                }
                else throne++;

                if(throne == 2) break;
            }

            System.out.println(ans);
        }

        sc.close();
    }
    
}