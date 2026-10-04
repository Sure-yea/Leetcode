class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                streak+=1;
            }
            else{
                if(max<streak) max=streak;
                streak=0;

            }
        }
        if(max<streak) max=streak;
        return max;
    }
}