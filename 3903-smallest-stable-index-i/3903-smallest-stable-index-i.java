class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int x : nums) min=Math.min(min,x);
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if((i-1)>=0 && nums[i-1]==min){
                min=Integer.MAX_VALUE;
                for(int j=i;j<nums.length;j++){
                    if(min>nums[j]) min=nums[j];
                }
            }
          
            if((max-min)<=k){
                return i;
            }
        }
        return ans;
    }
}