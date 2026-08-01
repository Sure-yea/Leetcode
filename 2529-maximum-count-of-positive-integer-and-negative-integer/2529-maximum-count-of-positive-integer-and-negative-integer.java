class Solution {
    public int maximumCount(int[] nums) {
        int lhs=0,rhs=nums.length-1;
        int mid=(lhs+rhs)/2;
        
        // while(lhs<=rhs){        //find end of 0
        //     mid=(lhs+rhs)/2;
        //     if(nums[mid]<0){
        //         lhs=mid+1;
        //     }
        //     else if(nums[mid]>0){
        //         rhs=mid-1;
        //     }
        //     else{ //nums[mid]==0
        //         lhs=mid+1;          
        //     }
        // }
        // int Pstart=mid;
        
        // int pos=nums.length-Pstart;
        
        // int mid2=mid;
        // int lhs2=lhs,rhs2=rhs;

        // while(lhs2<=rhs2){
        //     mid2=(lhs2+rhs2)/2;
        //     if(nums[mid2]<0){
        //         lhs2=mid2+1;
        //     }
        //     else if(nums[mid2]>0){
        //         rhs=mid2-1;
        //     }
        //     else{ //nums[mid]==0
        //         rhs=mid-1;          
        //     }
        // }
        // int Nend=mid2;
        // int neg=Nend;


        // System.out.println(Pstart);
        // System.out.println(Nend);
        // System.out.println(pos+" "+neg);
        // return(Math.max(pos,neg));


        while(lhs<=rhs){        //find left of 0s
            mid=(lhs+rhs)/2;
            if(nums[mid]<0){             //right
                lhs=mid+1;
            }

            else{ //nums[mid]==0          go left
                rhs=mid-1;          
            }
        }
        int negatives = lhs;


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
        int positives = nums.length - lhs2;

        System.out.println("lhs of zero "+mid+"\nrhs of zero "+mid2);
        return (Math.max(positives,negatives));


        


    }
}