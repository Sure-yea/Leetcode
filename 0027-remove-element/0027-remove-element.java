class Solution {
    public int removeElement(int[] nums, int val) {
       
        int temp;
        int count=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                temp=nums[n-1];
                nums[n-1]=nums[i];
                nums[i]=temp;
                n--;

            }
            else i++;
            
        }
        
        return n;
    }
}