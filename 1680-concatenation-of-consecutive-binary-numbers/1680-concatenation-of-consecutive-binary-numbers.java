
class Solution {

    public static long Binary(long x){
        long Binary=9l;
        while(x>0l){
            if(x%2l==0l) Binary*=10l;
            else if(x%2l==1l) Binary=Binary*10l+1l;
            x/=2l;
        }
        return reverse(Binary)/10l;
    }

    public static long reverse(long n) {
    long rev = 0l;

        while (n > 0l) {
            rev = rev * 10l + (n % 10l);
            n /= 10l;
        }

        return rev;
    }

    public static int concatenatedBinary(int n) {
        long sum=0l;
        long mul=1l;
        for(long i=n;i>0l;i--){
            long curr_bin=Binary(i);
            while(curr_bin>0l){
                if(curr_bin%10l==1l){
                    sum=(sum+mul)%1000000007l;
                }
                mul=(mul*2l)%1000000007l;
                curr_bin/=10l;
            }

        }
        return (int)sum;
    }
}