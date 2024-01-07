class Solution
{
    int min_lights(int hallway[], int n)
    {
        // Write your code here
        int mini = -1;
        int maxi = 0;
        int ans = 0;
        boolean flag = true;
        
        while(maxi < n-1) {
            
            for(int i=0; i<hallway.length; i++) {
                if(hallway[i] == -1) continue;
                
                if((i-hallway[i]) <= (mini+1) && (i+hallway[i])>maxi) {
                    maxi = i+hallway[i];
                }
                
                if((i-hallway[i]) <= 0) flag = false;
            }
            if(flag) return -1;
            if(mini == maxi) {
                if(mini == 0) ans++;
                if(hallway[mini+1] == 0) {
                    maxi = mini = mini + 1;
                }
                else return -1;
            }
            // if(mini == -1) return -1;
            ans++;
            mini = maxi;
        }
        if(ans == 0) return -1;
        return ans;
    }



}