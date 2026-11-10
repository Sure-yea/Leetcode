class Solution {

    
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        int digit=0;
        int max=0;
        int len=0;
        int mul=1;         
        for(int ele:nums){
            max=0;
            len=0;
            
            while(ele>0){
                digit=ele%10;
                if(max<digit) max=digit;
                len++;
                ele/=10;
            }
            
            for(int i=0; i<len; i++){
                sum+=max;
                max*=10;
            }
            
        }

        return sum;
    }
}