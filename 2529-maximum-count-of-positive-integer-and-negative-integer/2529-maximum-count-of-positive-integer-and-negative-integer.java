class Solution {
    public int maximumCount(int[] nums) {
        int lhs=0,rhs=nums.length-1;
        int mid=(lhs+rhs)/2;

        while(lhs<=rhs){        //find left of 0s
            mid=(lhs+rhs)/2;
            if(nums[mid]<0){             //right
                lhs=mid+1;
            }

            else{ //nums[mid]>=0          go left
                rhs=mid-1;          
            }
        }
        int neg = lhs;


        int lhs2=0,rhs2=nums.length-1;
        int mid2=(lhs+rhs)/2;
        while(lhs2<=rhs2){        //find right of 0s
            mid2=(lhs2+rhs2)/2;
            if(nums[mid2]>0){             //go left
                rhs2=mid2-1;
            }

            else{ //nums[mid]<=0          go right
                lhs2=mid2+1;          
            }
        }
        int pos=nums.length-lhs2;


        return (Math.max(pos,neg));

    }
}