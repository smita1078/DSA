//Brute
class Solution {
    
    public static int Knapsack(int W, int val[], int wt[], int n){
        if(n==0 || W==0) return 0;
        
        if(wt[n-1]>W){
            return Knapsack(W,val,wt,n-1);
        }
        
        int include = val[n-1]+ Knapsack(W-wt[n-1], val,wt, n-1);
        int exclude = Knapsack(W,val,wt,n-1);
        
        return Math.max(include,exclude);
    }
    static int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        return Knapsack(W,val,wt,n);
    }
}

//optimal
class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int[][] dp = new int[n+1][W+1]; // dp table including the case when there are 0 items and 0 weight
        
        for(int i=1;i<=n;i++){ //dp[i][w]  will store the maximum value achievable using first i items and w capacity
            for(int w=0;w<=W;w++){
                if(wt[i-1]<=w){ // if weight fits include it
                    dp[i][w]= Math.max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w]);
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
        return dp[n][W];
    }
}

}
