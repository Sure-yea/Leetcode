import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {

        // if(nums.length==0) return 0;
        // if(nums.length==1) return 1;

        // ArrayList<Integer> arr=new ArrayList<>();
        // arr.add(nums[0]);

        // int k=1;

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=arr.get(arr.size()-1)){
        //         arr.add(nums[i]);
        //         k++;
        //     }
        // }
        // for(int i=0;i<arr.size();i++){
        //     nums[i]=arr.get(i);
        // }
        
        // return k;


        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        int k=1;
        int index=1;
        int lastele=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=lastele){
                nums[index]=nums[i];
                index++;
                k++;
            }
            lastele=nums[i];
        }        
        return k;
    }
}