class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int Lpos=0;
        int rev=0;
        for(int i=0;i<s.length();i++){
            Lpos=s.charAt(i)-96;
            rev=26-Lpos+1;
            sum+=(i+1)*rev;

            //sum+=(i+1)*(26-(s.charAt(i)-96)+1);

        }
        return sum;
    }
}