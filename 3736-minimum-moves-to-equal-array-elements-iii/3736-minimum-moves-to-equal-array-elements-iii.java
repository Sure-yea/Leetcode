class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int ele: nums){
            if(max<ele) max=ele;
            sum+=ele;
        }
        
        return (max*nums.length)-sum;
        

    }
}