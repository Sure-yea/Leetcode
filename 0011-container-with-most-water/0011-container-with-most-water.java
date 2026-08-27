class Solution {
    
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int max=(height[i]>height[j]?height[j]:height[i])*(j-i);
        int water=max;

        while(i<j){
            water=(height[i]>height[j]?height[j]:height[i])*(j-i);
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