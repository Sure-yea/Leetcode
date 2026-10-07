class Solution {
    public int arrayPairSum(int[] nums) {
       
        int sum=0; 

        int[] frequencyAtIndex=new int[20001];    
       

        for(int i=0;i<nums.length;i++){
            frequencyAtIndex[nums[i]+10000]++;
        }

        //boolean take=true;
        int alternate=0;
        for(int j=0;j<frequencyAtIndex.length;j++){
            while(frequencyAtIndex[j]>0){
                if(alternate%2==0){
                    sum+=(j-10000);
                }
                alternate+=1;
                //take=!take;
                frequencyAtIndex[j]--;

            }
        }
        return sum;
    }
}