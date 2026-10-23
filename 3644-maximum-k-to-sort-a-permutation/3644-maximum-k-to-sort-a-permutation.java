class Solution {
    public int sortPermutation(int[] nums) {
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){ 
                if(ans==-1) ans=nums[i];
                   
                else ans= ans & nums[i];
                    
            }
        }
        System.out.println(0 & 1 & 2);
        if(ans==-1){
            return ans+1;
        }
        return ans;
    }
}