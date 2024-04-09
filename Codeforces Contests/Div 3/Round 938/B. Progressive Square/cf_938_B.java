import java.util.*;

public class cf_938_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int[][] arr = new int[n][n];
            int leastVal = Integer.MAX_VALUE;
            Map<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int val = sc.nextInt();
                    leastVal = Math.min(leastVal, val);
                    mp.put(val, mp.getOrDefault(val, 0) + 1);
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    arr[i][j] = -1;
                }
            }

            boolean ans = true;
            arr[0][0] = leastVal;
            mp.put(leastVal, mp.get(leastVal)-1);
            if(mp.get(leastVal) == 0) mp.remove(leastVal);

            outer:
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    int x = arr[i][j] + c;
                    int y = arr[i][j] + d;

                    if((i != n-1) && arr[i+1][j] == -1) {
                        if(!mp.containsKey(x)) {
                            // System.out.println(i + " " + j + " " + x);
                            ans = false;
                            break outer;
                        }
                        else {
                            int val = mp.get(x);
                            arr[i+1][j] = x;
                            if(val == 1) mp.remove(x);
                            else mp.put(x, val-1);
                        }
                    }

                    if((j != n-1) && arr[i][j+1] == -1) {
                        if(!mp.containsKey(y)) {
                            // System.out.println(i + " " + j + " " + y);
                            ans = false;
                            break outer;
                        }
                        else {
                            int val = mp.get(y);
                            arr[i][j+1] = y;
                            if(val == 1) mp.remove(y);
                            else mp.put(y, val-1);
                        }
                    }
                }
            }

            // for(int i=0; i<n; i++) {
            //     for(int j=0; j<n; j++) {
            //         System.out.print(arr[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
