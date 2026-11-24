class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int max2=0;
        int index=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max2=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }
        }

        if(max>=max2*2) return index;
        else return -1;
    }
}