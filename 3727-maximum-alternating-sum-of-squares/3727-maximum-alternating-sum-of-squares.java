class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] count=new int[40001];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                nums[i]=-nums[i];
            }
            count[nums[i]]++;
        }
        int i=0;
        int j=40000;
        int turn=1;
        long sum=0l;
        while(i<j){
            while(count[i]==0){
                i++;
            }
            while(count[j]==0){
                j--;
            }

            if(turn%2==0){
                //System.out.println("i: "+i);
                sum-=(long)(i*i);
                count[i]--;
            }
            
            else{//(turn%2==1){
                //System.out.println("j: "+j);
                sum+=(long)(j*j);
                count[j]--;
            }
            turn++;
        }
        // System.out.println("loop ended");
        // System.out.println("i: "+i);
        // System.out.println("j: "+j);
        // System.out.println("count[i]: "+count[i]);
        // System.out.println("count[j]: "+count[j]);
        
    
        if(turn%2==0 && count[i]%2==1) sum-=(i*i);
        if(turn%2==1 && count[i]%2==1) sum+=(i*i);

        


        

        return sum;

    }
}