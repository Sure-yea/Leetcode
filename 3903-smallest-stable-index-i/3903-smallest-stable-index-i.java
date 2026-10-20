class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int min=1000000000;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            max=0;
            min=1000000000;
            for(int j=i;j<nums.length;j++){
                if(min>nums[j]) min=nums[j];
            }

            for(int j=0;j<=i;j++){
                if(max<nums[j]) max=nums[j];
            }


            if((max-min)<=k){
                return i;
            }
        }
        return ans;
    }
}