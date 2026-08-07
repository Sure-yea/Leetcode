class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        //accidentally did it for 1 missing element
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         sum+=i;
    //     }
    //     return sum;
    // }
    // public List<Integer> findMissingElements(int[] nums) {
    //     int min=nums[0];
    //     int sum=0;
    //     for(int ele: nums){
    //         if(min>ele) min=ele;
    //         sum+=ele;
    //     }


    //     //min, min+1, min,         min+length-1
    //     int sum_should_be=  sum(min+nums.length-1)-sum(min-1);

    //     return sum_should_be-sum;

        
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        if(nums.length==2){
            for(int i=nums[0]+1;i<nums[1];i++){
                arr.add(i);
            }
            return arr;
        }


        
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