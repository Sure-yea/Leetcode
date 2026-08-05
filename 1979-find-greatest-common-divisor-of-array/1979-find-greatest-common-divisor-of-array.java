class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int ele:nums){
            if(ele<min) min=ele;
            if(ele>max) max=ele;
        }

        for(int i=min;i>=1;i--){
            if(min%i==0 && max%i==0) return i;
        }
        return 1;
    }
}