class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2) return n; 
        int min=100000;
        int i1=0;
        int max=-100000;
        int i2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                i2=i;
            }
            if(nums[i]<min){
                min=nums[i];
                i1=i;
            }
        }

        int temp;
        if(i1>i2){
            temp=i1;
            i1=i2;
            i2=temp;
        }

        //min of
        // Math.max( (nums.length-i1), (nums.length-i2) )            //dlt from right
        // Math.max( i1+1, i2+1 )  = i2+1                                   // dlt from left
        // (i1+1)+(nums.length-i2)                                      // dlt from both side

        return Math.min(
                nums.length-i1,
            
                Math.min(
                    i2+1,
                    i1+1+(nums.length-i2)
                )
            );
    }
}