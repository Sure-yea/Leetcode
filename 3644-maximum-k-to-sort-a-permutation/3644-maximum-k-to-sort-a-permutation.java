class Solution {
    public int sortPermutation(int[] nums) {
        int ans=131071;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){ 
                ans= ans & nums[i];
                    
            }
        }
        System.out.println(0 & 1 & 2);
        if(ans==131071){
            return 0;
        }
        return ans;
    }
}