import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cf_938_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;

            int[] a = new int[n];
            int[] b = new int[m];

            Map<Integer, Integer> mb = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
                mb.put(b[i], mb.getOrDefault(b[i], 0)+1);
            }

            Map<Integer, Integer> ma = new HashMap<>();
            int cnt = 0;

            int st = 0, end = 0;

            for(int i=0; i<m; i++) {
                int val = a[end++];
                if(mb.containsKey(val)) {
                    ma.put(val, ma.getOrDefault(val, 0)+1);
                    if(ma.get(val) <= mb.get(val)) cnt++;
                }
            }

            if(cnt >= k) ans++;

            while(end < n) {
                int v1 = a[st++];
                if(mb.containsKey(v1)) {
                    ma.put(v1, ma.get(v1)-1);
                    if(ma.get(v1) < mb.get(v1)) cnt--;
                }

                int v2 = a[end++];
                if(mb.containsKey(v2)) {
                    ma.put(v2, ma.getOrDefault(v2, 0)+1);
                    if(ma.get(v2) <= mb.get(v2)) cnt++;
                }

                if(cnt >= k) ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
