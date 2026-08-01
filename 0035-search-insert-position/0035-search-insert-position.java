class Solution {
    public int searchInsert(int[] nums, int target) {
        int lhs=0,rhs=nums.length-1;
        int mid=(lhs+rhs)/2;
        int index=mid;
        while(lhs<=rhs){
            mid=(lhs+rhs)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                lhs=mid+1;
            else
                rhs=mid-1;
        }

        return lhs;
    }
}   