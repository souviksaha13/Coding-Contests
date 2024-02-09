import java.util.*;

public class Solution {

    static String find(int[] a, int[] b, Set<Integer> sa, Set<Integer> sb, int k) {
        int cnta = 0, cntb = 0;

        for(int i=1; i<=k; i++) {
            if(!sa.contains(i) && !sb.contains(i)) return "NO";
            else if(sa.contains(i) && !sb.contains(i)) cnta++;
            else if(!sa.contains(i) && sb.contains(i)) cntb++;
        }
        if(cnta > k/2 || cntb > k/2) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            Set<Integer> sa = new HashSet<>();
            Set<Integer> sb = new HashSet<>();


            for(int j=0; j<n; j++) {
                a[j] = sc.nextInt();
                sa.add(a[j]);
            }

            for(int j=0; j<m; j++) {
                b[j] = sc.nextInt();
                sb.add(b[j]);
            }

            System.out.println(find(a, b, sa, sb, k));
        }

        sc.close();
    }
}
