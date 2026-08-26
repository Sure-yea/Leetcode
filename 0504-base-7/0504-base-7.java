class Solution {
    public String convertToBase7(int num) {
        // if(num==0) return "0";
        // ArrayList<Character> arr=new ArrayList<>();
        // boolean neg=false;
        // if(num<0){
        //     num=-num;
        //     neg=true;
        // }
        
        // while(num>0){
        //     arr.add((char)  ((num%7)+'0'));
        //     num/=7;
        // }

        // if(neg==true) arr.add('-');


        // StringBuilder sb = new StringBuilder();
        
        // int n=arr.size();
        // while(n>0){
        //     sb.append(arr.get(n-1));
        //     n--;
        // }

        // String result = sb.toString();
        // return result;



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