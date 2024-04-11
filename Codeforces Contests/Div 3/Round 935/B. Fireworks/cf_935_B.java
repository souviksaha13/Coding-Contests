import java.util.*;

public class cf_935_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();

            System.out.println(((m/a)+1) + ((m/b)+1));
        }

        sc.close();
    }
}
