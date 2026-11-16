class Solution {


    int n=0;

    public String digitSum(String s, int k) {
        int n=s.length();
        String st=s;
        int sum=0;
        int counter=1;

        if(n<=k){
            System.out.println("chota ho gya");
            System.out.println("println chota  "+st);
            return st;
        }

       
        
        else{
            st="";
            System.out.println("grouping and summing...");
            for(int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                if(counter%(k)==0 || i==s.length()-1){
                    System.out.println("adding sum to str  "+sum);
                    st+= String.valueOf(sum);
                    sum=0;
                }
                counter++;
            }
            System.out.println(st);
            s=digitSum(st,k);

        }
        
        return s;
    }
}
