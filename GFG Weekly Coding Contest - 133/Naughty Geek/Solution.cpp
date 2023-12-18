class Solution{   
public:
    long long int totalWays(int N)
    {
        if(N == 1) return 1;
        return N*totalWays(N-1);
    }
};