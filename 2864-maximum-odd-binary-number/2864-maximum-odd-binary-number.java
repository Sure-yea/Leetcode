class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for(int i=1; i<=one-1; i++){
            ans.append('1');
        }
        for(int i=1; i<=n-one; i++){
            ans.append('0');
        }

        ans.append('1');
        return ans.toString();
    }
}