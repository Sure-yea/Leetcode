class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        for(int ele: nums){
            if (ele<min) min=ele;
        }

        int sum=0;
        for(int ele: nums){
            sum+=(ele-min);
        }
        return sum;
    }
}