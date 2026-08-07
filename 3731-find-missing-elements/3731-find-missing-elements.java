class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        
        int i=1;
        int number=nums[0]+1;
        while(i<nums.length){
            if(number!=nums[i]){
                arr.add(number);
                number++;
            }
            else{//number==nums[i]
                i++;
                number++;
            }
        }

        return arr;
    }   
}