class Solution {
    public int trap(int[] height) {
        int left=height[0];
        int water=0;
        int index=0;
        int area=0;
        int stones=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>=left){
                area=left*(i-index-1);
                water+=(area-stones);
                
                stones=0;
                left=height[i];
                index=i;
            }
            else{       //height[i]<left
                stones+=height[i];
                System.out.println(stones);
            }
        }
        
        
        int Rindex=height.length-1;
        int right=height[Rindex];
        area=0;
        stones=0;
        for(int i=height.length-2;i>=index;i--){
            if(height[i]>=right){
                area=right*(Rindex-i-1);
                water+=(area-stones);
                
                stones=0;
                right=height[i];
                Rindex=i;
            }
            else{
                stones+=height[i];
                System.out.println(stones);
            }
        }
        
        return water;
    }
}