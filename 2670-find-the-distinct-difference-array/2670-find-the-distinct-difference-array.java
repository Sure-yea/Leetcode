class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int uni=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count.containsKey(nums[i])){
                count.put(nums[i],count.get(nums[i])+1);
            }
            else{
                count.put(nums[i],1);
            }


            if(count.get(nums[i])==1){
                uni++;
            }
            
        }

        HashMap<Integer, Integer> LHScount = new HashMap<>();
        int L_uni=0;
        int R_uni=uni;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){

        

            
            if(LHScount.containsKey(nums[i])){
                LHScount.put(nums[i],LHScount.get(nums[i])+1);
            }
            else{
                LHScount.put(nums[i],1);
            }

            
            if(LHScount.get(nums[i])==1){
                L_uni++;
            }



        
            count.put(nums[i],count.get(nums[i])-1);


            
            if(count.get(nums[i])==0){
                R_uni--;
            }



            
            ans[i]=L_uni-R_uni;
            
        }


        return ans;

    }
}