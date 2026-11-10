class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int index=-1;
        int max=0;
        int ans=nums.length;
        int number=0;
        ArrayList<Integer> numbers =new ArrayList<>();

        for(int ele: nums){
            
            if(!count.containsKey(ele)) count.put(ele, 1);
            else count.put(ele,count.get(ele)+1);

            if(count.get(ele)>max){
                max=count.get(ele);
                number=ele;

            } 
        }
        for(int ele: nums){
            if(count.get(ele)==max){
                number=ele;

                int i=0;
                while(nums[i]!=number) i++;
                

                int j=nums.length-1;
                while(nums[j]!=number) j--;
                ans=Math.min(ans,j-i+1);
            }

        }

        return ans;
    }
}