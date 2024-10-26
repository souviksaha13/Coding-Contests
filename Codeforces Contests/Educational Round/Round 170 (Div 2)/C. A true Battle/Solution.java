import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            String str = sc.next();

            if(n==1) {
                if(str.equals("1")) System.out.println("YES");
                else System.out.println("NO");
            }
            // else if(n==2 && (str.equals("01") || str.equals("10") || str.equals("11"))) System.out.println("YES");
            else if(str.charAt(0)=='1' || str.charAt(n-1)=='1') System.out.println("YES");

            else {
                boolean isPossible = false;
                for(int i=0; i<n-1; i++) {
                    if(str.substring(i,i+2).equals("11")) isPossible = true;
                }

                if(isPossible) System.out.println("YES");
                else System.out.println("NO");
            }
        }

        sc.close();
    }
}
