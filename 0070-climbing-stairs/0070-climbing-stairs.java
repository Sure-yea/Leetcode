class Solution {

    public long C(long n,long i){
        if(i==0 || n==0 || i==n) return 1;
        long prod=1l;
        for(long j=0l;j<i;j++){
            // n!/(n-i)!*i!     =  n n-1 n-2... (n-i)!   
            //                        1   2 ...   i
            //prod*= (n-j)/(j+1);  this will lead to truncation of decimal if not divisible
            prod=prod*(n-j)/(j+1);  //this will divide prod as prod is big number
        }
        return prod;
    }
    

    public int climbStairs(int k) {
        if(k<=3) return k;
        long n=(long)k;
        long sum=0l;
        
            //0x    2      n    1           cases 1                                                n   c 0
            //1x    2      n-2  1           cases (n-1)!/(n-2)! =  (n-1)/1!                        n-1 c 1
            //2x    2      n-4  1           cases (n-2)!/  (n-4)!*2! = (n-2)(n-3)/2!               n-2 c 2
            //3x    2      n-6  1           cases (n-3)!/  (n-6)!*3! = (n-3)(n-4)(n-5)/3!          n-3 c 3
            //Xx    2      n-2X 1           cases (n-X)!/ (n-2X)!*(X)!=                            n-X c X
            //(n/2) 2      0    1           cases 1                                                n-n c n
        
        for(long i=1l;i<=n;i++){
            sum+=C(n-i,i);
        }     


        int ans=(int)sum;
        return ans;  
    }
}