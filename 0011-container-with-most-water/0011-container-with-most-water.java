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
            if(water>max) max=water;
            if(height[i]<height[j]){   
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}