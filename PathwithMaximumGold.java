class Solution {

    int dfs(int[][] grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 ||i>=m || j>=n || grid[i][j]==0){
            return 0;
        }

        int gold = grid[i][j];
    grid[i][j] = 0; // mark as visited

    int up = dfs(grid, i - 1, j);
    int down = dfs(grid, i + 1, j);
    int left = dfs(grid, i, j - 1);
    int right = dfs(grid, i, j + 1);

    int maxi = Math.max(Math.max(up, down), Math.max(left, right));        
    grid[i][j]=gold; //backtrack
        return maxi+gold;
    }
    public int getMaximumGold(int[][] grid) {
        int maxi=0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                maxi = Math.max(maxi,dfs(grid,i,j));
                }
            }
        }
        return maxi;
    }
}
