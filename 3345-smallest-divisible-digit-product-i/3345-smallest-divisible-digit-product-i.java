class Solution {
    public int prod(int n){
        int p=1;
        while(n>0){
            p=p*(n%10);
            n=n/10;
        }
        return p;
    }

    int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(prod(i)%t==0) return i;
        
        }
        return 0;
    }
}