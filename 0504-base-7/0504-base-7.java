class Solution {
    public String convertToBase7(int num) {
        



        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean neg=false;
        if(num<0){
            num=-num;
            neg=true;
        }
        
        while(num>0){
            sb.append((char)  ((num%7)+'0'));
            num/=7;
        }

        if(neg==true) sb.append('-');


        String result=sb.reverse().toString();
        return result;
    }
}