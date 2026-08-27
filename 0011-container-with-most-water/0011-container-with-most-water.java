class Solution {
    public int min(int a,int b){
        return a>b?b:a;
    }
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=min(height[i],height[j])*(j-i);
        int water=max;
        while(i<j){
            water=min(height[i],height[j])*(j-i);
            if(height[i]<height[j]){
                
                if(water>max) max=water;
                i++;
            }
            else{
                
                if(water>max) max=water;
                j--;
            }
        }
        return max;
    }
}