class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lhs=0,rhs=nums.length;
        int mid=lhs+(rhs-lhs)/2;

        //  x  x  y  y  z  z  a  b  b  c  c
        //  0  1  2  3  4  5  6  7  8  9  10
        //2nd wala on odd until the single element
        while(lhs<=rhs){
            mid=lhs+(rhs-lhs)/2;
            if(mid==0 || mid==nums.length-1) return nums[mid];


            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] ) return nums[mid];

            else if(nums[mid]==nums[mid+1] && (mid+1)%2==1       ||      nums[mid]==nums[mid-1] && (mid-1)%2==0){    //go right
                lhs=mid+1;
            }

            else if(nums[mid]==nums[mid+1] && (mid+1)%2==0       ||      nums[mid]==nums[mid-1] && (mid-1)%2==1){    //go left
                rhs=mid-1;
            }
        }

        return nums[lhs];
        
    }
}