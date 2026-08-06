class Solution {
    public int maximumProduct(int[] nums) {
        
        int max=-1001;
        int max2=-1001;
        int max3=-1001;
        int min=1001;
        int min2=1001;




        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max3=max2;
                max2=max;
                max=nums[i];
            }
            else if(max2<nums[i]){
                max3=max2;
                max2=nums[i];
            }
            else if(max3<nums[i]){
                max3=nums[i];
            }

            if(min>nums[i]){
                min2=min;
                min=nums[i];
            }
            else if(min2>nums[i]){
                min2=nums[i];
            }
        }
        return(   Math.max( min*min2*max   ,   max*max2*max3 )    );
        
    }
}