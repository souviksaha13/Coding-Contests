import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();

            // according to the constraints, the maximum possible values of a & b is 20
            Set<Integer> hs = new HashSet<>();

            for (int x = 0; x <=20; x++) {
                if(Math.pow(a, x) > l) break;
                for (int y = 0; y <=20; y++) {
                    if(Math.pow(b, y) > l) break;
                    double val = Math.pow(a, x) * Math.pow(b, y);
                    if(l%val == 0) {
                        hs.add((int)(l/val));
                    }
                }
            }

            System.out.println(hs.size());
        }

        sc.close();
    }
}
