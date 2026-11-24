class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            else{
                zero++;
            }
        }

        String ans="";
        for(int i=1; i<=one-1; i++){
            ans+='1';
        }
        for(int i=1; i<=zero; i++){
            ans+='0';
        }
        return ans+'1';
    }
}