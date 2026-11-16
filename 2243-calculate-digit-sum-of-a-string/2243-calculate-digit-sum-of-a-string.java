class Solution {


    int n=0;

    public String digitSum(String s, int k) {
        int n=s.length();
        String st=s;
        int sum=0;
        int counter=1;

        if(n<=k){
            return st;
        }

       
        
        else{
            st="";
            for(int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                if(counter%(k)==0 || i==s.length()-1){
                    st+= String.valueOf(sum);
                    sum=0;
                }
                counter++;
            }
            s=digitSum(st,k);

        }
        
        return s;
    }
}
