class Solution {


    public String revandtostring(ArrayList<Integer> arr){
        String ans="";
        int ch;
        for(int i=arr.size()-1;i>=0;i--){
            ch=arr.get(i)+'0';
            ans+=(char)ch;
        }
        return ans;
    }



    public String addBinary(String a, String b) {

        if(a.length()<b.length()){
            String temp=a;
            a=b;
            b=temp;
        }
        int i=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int carry=0;
        int digit;
        int A;
        int B;
        while(i<a.length()){
            
            A = a.charAt(a.length()-1-i)-'0';

            if(b.length()-1-i<0)  B=0;
            else B = b.charAt(b.length()-1-i)-'0';
            
            digit=A+B+carry;
            carry=0;
            
            if(digit==2){
                digit=0;
                carry=1;
                arr.add(digit);

            }
            else if(digit==3){
                digit=1;
                carry=1;
                arr.add(digit);
            }
            else arr.add(digit);
            i++;
            
                
        }
        if(carry==1){
            arr.add(1);
        }
        
        return revandtostring(arr);
    }
}