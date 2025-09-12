class Solution {
//Brute
    public int maxArea(int[] height) {
        int maxi=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int high = Math.min(height[i],height[j]);
                int width = (j-i);
                int area = high*width;
                maxi=Math.max(maxi,area);
            }
        }
        return maxi;
    }
//Optimal
      public int maxArea(int[] height) {
        int maxi=0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            int width = r-l;
            int high = Math.min(height[l],height[r]);
            int area = width * high;
            maxi=Math.max(area,maxi);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxi;
    }
  
}
