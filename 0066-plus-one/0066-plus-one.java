class Solution {
    public int[] plusOne(int[] digits) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // int carry=1;
        // int i=digits.length-1;
        // int digit=digits[i];
        
        // while(i>=0){
        //     digit=digits[i];
        //     digit+=carry;
        //     carry=digit/10;
        //     digit=digit%10;
        //     arr.add(0,digit);
        //     i--;
        // }

        // if (carry==1){
        //     arr.add(0,1);
        // }



        // int[] ans=new int[arr.size()];
        // for(int j=0;j<arr.size();j++){
        //     ans[j]=arr.get(j);
        // }
        // return ans;





        // ArrayList<Integer> arr=new ArrayList<>();
    
        // int i=digits.length-1;
        
        // while(digits[i]==9){
        //     arr.add(0);
        //     i--;
        //     if(i==-1){
        //         arr.add(0,1);
        //         int[] ans=new int[arr.size()];
        //         for(int j=0;j<arr.size();j++){
        //             ans[j]=arr.get(j);
        //         }
        //         return ans;
        //     }
                
        // }

        // arr.add(0,digits[i]+1);
        // i--;

        // while(i>=0){
        //     arr.add(0,digits[i]);
        //     i--;
        // }


        // int[] ans=new int[arr.size()];
        // for(int j=0;j<arr.size();j++){
        //     ans[j]=arr.get(j);
        // }
        // return ans;
        
        
        int carry=1;

        int i=digits.length-1;
        
        while(i>=0){
            if(carry==1){
                if(digits[i]==9){
                    digits[i]=0;
                    carry=1;
                }
                else{
                    digits[i]++;
                    carry=0;
                }
            }
            i--;
            
                
        }
        if(carry==1){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for(int a=1;a<arr.length;a++){
                arr[a]=digits[a-1];
                return arr;
            }
        }
        
        return digits;
    }
}