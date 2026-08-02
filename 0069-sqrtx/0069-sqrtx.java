class Solution {
    public int mySqrt(int n) {
        if(n<=1) return n;
        int lhs=0, rhs=n;

        int mid=0;
        while(lhs<=rhs){
            mid= (lhs)+(rhs-lhs)/2;           //(lhs+rhs)/2

            if(  mid    ==  n/mid  ){         //mid*mid    ==  n
                return mid;
            }

            else if(  mid    <  n/mid  ){
                lhs=mid+1;

            }
            
            else if(  mid    >  n/mid  ){
                rhs=mid-1;
            }

        }
        return rhs;
    }
}