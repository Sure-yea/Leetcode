class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        
        int nonZero=1;
        nonZero=nums[0]==0?0:1; 
        
        int trav=0;
        int temp=0;

        for(int i=1; i<n; i++){
            if(nums[i]!=0){
                temp=nums[nonZero];
                nums[nonZero]=nums[i];
                nums[i]=temp;
                nonZero++;
            }
        }

    
    }
}