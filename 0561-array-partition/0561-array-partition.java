class Solution {
    public int arrayPairSum(int[] nums) {
        // Arrays.sort(nums);
        int sum=0;
        // for(int i=0;i<nums.length;i+=2){
        //     sum+=nums[i];
        // }
        // return sum;

        int[] frequencyAtIndex=new int[20001];    
        
        //   index            number
        // 0-10,000:        -10,000-0

        // 10,001-20,000     1-10,000

        // index-10,000 = number
        // index=num+10,000

        for(int i=0;i<nums.length;i++){
            frequencyAtIndex[nums[i]+10000]++;
        }

        boolean take=true;
        for(int j=0;j<frequencyAtIndex.length;j++){
            while(frequencyAtIndex[j]>0){
                if(take==true){
                    sum+=(j-10000);
                }
                take=!take;
                frequencyAtIndex[j]--;

            }
        }
        return sum;
    }
}