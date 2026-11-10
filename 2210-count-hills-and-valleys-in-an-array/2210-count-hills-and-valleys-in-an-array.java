class Solution {
    public int countHillValley(int[] nums) {
        int ans=0;

        int l=0;
        int r=0;

        int i=1;
        while(i<nums.length){
            
            
            l=i;
            r=i;
            while(nums[l]==nums[r]){
                r++;
                if(r==nums.length) return ans;
            }
            r--;

            if(nums[l-1]<nums[l] && nums[r]>nums[r+1] ){
                ans++;
            }
            if(nums[l-1]>nums[l] && nums[r]<nums[r+1] ){
                ans++;
            }

            i=r+1;
        }


        return ans;
    }
}