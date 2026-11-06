class Solution {
    public int[] decimalRepresentation(int n) {
        
        int multi=1;
        int size=0;
        int digit=0;
        ArrayList<Integer> arr= new ArrayList<>();

        while(n>0){
            digit=n%10;
            if(digit!=0){
                arr.add(digit*multi);
                size++;
            }
            n=n/10;
            multi*=10;
        }

        int[] ans=new int[size];
        for(int j=size-1; j>=0; j--){
            ans[size-j-1]=arr.get(j);
        }        
        return ans;
    }
}