class Solution {
    public int[] resultArray(int[] nums) {

        // ArrayList<Integer> arr1 =new ArrayList<>();
        // ArrayList<Integer> arr2 =new ArrayList<>();
        
        // int a1=nums[0];
        
        // int a2=nums[1];
        // arr1.add(a1);
        // arr2.add(a2);
        
        // int i=2;
        // while(i<nums.length){
        //     if(a1>a2){
        //         arr1.add(nums[i]);
        //         a1=nums[i];
        //     }
        //     else{
        //         arr2.add(nums[i]);
        //         a2=nums[i];        
        //     }

        //     i++;
        // }

        // int j=0;
        // int[] result=new int[nums.length];
        // for(int ele: arr1){
        //     result[j]=ele;
        //     j++;
        // }
        // for(int ele: arr2){
        //     result[j]=ele;
        //     j++;
        // }
        

        // return result;

    
        ArrayList<Integer> arr2 =new ArrayList<>();
        int[] result=new int[nums.length];
    
        int a1=nums[0];
        
        result[0]=nums[0];
        int index=1;
        int a2=nums[1];
        arr2.add(a2);
        
        int i=2;
        while(i<nums.length){
            if(a1>a2){
                result[index]=nums[i];
                a1=nums[i];
                index++;
            }
            else{
                arr2.add(nums[i]);
                a2=nums[i];        
            }

            i++;
        }

        for(int ele: arr2){
            result[index]=ele;
            index++;
        }
        

        return result;
    }
}