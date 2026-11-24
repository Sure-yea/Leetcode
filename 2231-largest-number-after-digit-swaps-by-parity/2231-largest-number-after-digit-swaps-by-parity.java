class Solution {
    public int largestInteger(int num) {
        

        
        String st=String.valueOf(num);
        
        int[] oddCount= new int[10];
        int[] evenCount= new int[10];
        ArrayList<Boolean> oddBoolean= new ArrayList<>();

        int n= st.length();
        int digit=0;

        for(int i=0; i<n; i++){
            digit=st.charAt(i)-'0';
            if(digit%2==1){
                oddCount[digit]++;
                oddBoolean.add(true);
            }
            else{
                evenCount[digit]++;
                oddBoolean.add(false);
            }
        }

        int decide=0;
        int ans=0;
        int i=9;
        int j=9;
        while(decide<n){
            while(i>0 && oddCount[i]==0) i--;
            while(j>0 && evenCount[j]==0) j--;


            if(oddBoolean.get(decide)){
                ans*=10;
                ans+=i;
                oddCount[i]--;
            }
            else{
                ans*=10;
                ans+=j;
                evenCount[j]--;
            }
            decide++;
        }

        return ans;
    }
}