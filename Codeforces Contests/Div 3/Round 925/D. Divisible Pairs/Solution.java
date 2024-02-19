import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int m = 0; m < t; m++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            long[] arr = new long[n];

            Map<String, Integer> mp = new HashMap<>();
            long ans = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] =1l * sc.nextInt();
                long difx = arr[i]%x;
                long dify = arr[i]%y;
                long reqdDifx = ((1l * x) - difx)%(1l * x);

                String lookupPair = String.valueOf(reqdDifx) + "#" + String.valueOf(dify);

                ans += mp.getOrDefault(lookupPair, 0);
                // System.out.println(lookupPair.difx + " " + lookupPair.dify + " " +mp.get(lookupPair));
                
                String updatePair = String.valueOf(difx) + "#" + String.valueOf(dify);
                mp.put(updatePair, mp.getOrDefault(updatePair, 0)+1);

                // System.out.println(mp.size() + " " + mp.get(updatePair) + " " + difx + " " + dify);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
