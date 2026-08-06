class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int temp=0;
        int index=0;

        if(nums.length==3) return(nums[0]*nums[1]*nums[2]);

        if(nums.length==4){
            int a=nums[1]*nums[2]*nums[3];
            int b=nums[0]*nums[2]*nums[3];
            int c=nums[0]*nums[1]*nums[3];
            int d=nums[0]*nums[1]*nums[2];
            return Math.max(   Math.max(  a,b   )  ,  Math.max(   c,d   )         );
        }


        for(int j=nums.length-1;j>=nums.length-3;j--){
            for(int i=j;i>=0;i--){
                if(max<nums[i]){
                    max=nums[i];
                    index=i;
                }
            }
            
            temp=nums[j];
            nums[j]=nums[index];
            nums[index]=temp;
            max=Integer.MIN_VALUE;
            
        }
        


        for(int j=0;j<=1;j++){
            for(int i=j;i<nums.length;i++){
                if(nums[i]>0){
                    continue;
                }
                if(min>nums[i]){
                    min=nums[i];
                    index=i;
                }
            }
            if(min>0) return nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
            temp=nums[j];
            nums[j]=nums[index];
            nums[index]=temp;
            min=Integer.MAX_VALUE;
            
        }


        return(   Math.max( nums[0]*nums[1]*nums[nums.length-1]   ,   nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1] )    );
        
    }
}