class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] answer= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
        }

        for(int i=0;i<answer.length;i++){
           // if(nums[i]<0){
             //   answer[i]=0;
            //}
            
            if(nums[i]==0){
                int x=1;
                for(int j=0;j<nums.length;j++){
                    if(i==j) continue;
                    else x*=nums[j];
                }
                answer[i]=x;

            }
            else{
                answer[i]=(prod/nums[i]);
            }
        }
        return answer;
    }
}