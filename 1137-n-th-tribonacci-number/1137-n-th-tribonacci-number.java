class Solution {
    public int tribonacci(int n) {
        //if(n==0) return 0;
        //if(n==1 || n==2) return 1;

        int a=0;
        int b=1;
        int c=1;
        
        int temp=0;

        for(int i=0; i<n; i++){
            temp=a;
            a=b;
            b=c;
            c=b+a+temp;
        }

        return a;
    }
}