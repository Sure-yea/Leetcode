class Solution {
    public int mySqrt(int n) {
        if(n<=1) return n;
        int lhs=0, rhs=n;

        int mid=0;
        while(lhs<=rhs){
            mid= (lhs)+(rhs-lhs)/2;           //(lhs+rhs)/2
            int x=n/mid;

            if(  mid    ==  x ){         //mid*mid    ==  n
                return mid;
            }

            else if(  mid    <  x ){
                lhs=mid+1;

            }
            
            else if(  mid    >  x  ){
                rhs=mid-1;
            }

        }
        return rhs;
    }
}