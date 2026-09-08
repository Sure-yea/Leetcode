class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] answer= new int[nums.length];

        int zero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
                continue;
            }
            prod*=nums[i];
        }

    
        for(int i=0;i<answer.length;i++){
            if(zero==0){
                answer[i]=(prod/nums[i]);
            }
            if(zero==1){
                if(nums[i]==0) answer[i]=prod;
                else answer[i]=0;
            }
            if(zero>=2) return new int[nums.length];
        }
        return answer;
    }
}