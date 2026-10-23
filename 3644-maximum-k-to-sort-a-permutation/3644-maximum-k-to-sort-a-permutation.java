class Solution {
    public int sortPermutation(int[] nums) {
        int ans=131071;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){ 
                ans= ans & nums[i];
        
            }
            if(ans==0) return 0;
        }

        if(ans==131071){
            return 0;
        }
        return ans;
    }
}