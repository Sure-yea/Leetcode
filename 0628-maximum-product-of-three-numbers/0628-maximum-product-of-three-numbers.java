class Solution {
    public int maximumProduct(int[] nums) {

        int max=-1001;
        int max2=-1001;
        int max3=-1001;
        int min=1001;
        int min2=1001;


        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(max<x){
                max3=max2;
                max2=max;
                max=x;
    
            }
            else if(max2<x){
                max3=max2;
                max2=x;
            }
            else if(max3<x){
                max3=x;
            }



            if(min>x){
                min2=min;
                min=x;
               
            }
            else if(min2>x){
                min2=x;
            }
        }
        return(   Math.max( min*min2*max   ,   max*max2*max3 )    );
        
    }
}