class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=0;
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int ele: nums){
            if(ele<target){
                count++;
            }
            if(ele==target){
                n++;
            }
        }

        while(n>0){
            ans.add(count);
            count++;
            n--;
        }


        return ans;
    }
}