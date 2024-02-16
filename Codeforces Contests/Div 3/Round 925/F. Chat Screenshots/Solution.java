import java.util.*;

public class Solution {

    static boolean dfsDetectCylce(List<List<Integer>> adj, boolean[] vis, boolean[] pathvis, int src) {
        vis[src] = true;
        pathvis[src] = true;

        for(Integer el : adj.get(src)) {
            if(!vis[el]) {
                boolean ans = dfsDetectCylce(adj, vis, pathvis, el);
                if(ans) return ans;
            }
            else if(pathvis[el]) return true;
        }

        pathvis[src] = false;
        return false;
    }

    static String checkSnap(int n, int k, int[][] arr) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] array : arr) {
            for(int i=1; i<n-1; i++) {
                // making all the values from 1-indexed to 0-indexed
                int e1 = array[i]-1;
                int e2 = array[i+1]-1;

                adj.get(e1).add(e2);
            }
        }

        boolean[] vis = new boolean[n];
        boolean[] pathvis = new boolean[n];

        for(int i=0; i<n; i++) {
            if (!vis[i]) {
                boolean ans = dfsDetectCylce(adj, vis, pathvis, i);
                if(ans) return "No";
            }
        }

        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] arr = new int[k][n];

            for(int i=0; i<k; i++) {
                for(int j=0; j<n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println(checkSnap(n, k, arr));
        }

        sc.close();
    }
}
