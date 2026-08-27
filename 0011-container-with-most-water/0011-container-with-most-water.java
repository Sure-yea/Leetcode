class Solution {
    public int min(int a,int b){
        return a>b?b:a;
    }
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=min(height[i],height[j])*(j-i);
        int water=min(height[i],height[j])*(j-i);
        while(i<j){
            if(height[i]<height[j]){
                water=min(height[i],height[j])*(j-i);
                if(water>max) max=water;
                i++;
            }
            else{//height[i]>=height[j]
                water=min(height[i],height[j])*(j-i);
                if(water>max) max=water;
                j--;
            }
        }
        return max;
    }
}