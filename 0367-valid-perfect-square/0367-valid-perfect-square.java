class Solution {
    public boolean isPerfectSquare(int n) {
        if(n<=1) return true;
        long lhs=0, rhs=n;

        long mid=0;
        while(lhs<=rhs){
            mid=(lhs)+(rhs-lhs)/2;           //(lhs+rhs)/2

            if(  mid*mid    ==  n  ){         //mid*mid    ==  n
                return true;
            }

            else if(  mid*mid    <  n ){
                lhs=mid+1;

            }
            
            else if(  mid*mid    >  n  ){
                rhs=mid-1;
            }

        }
        return false;
        
        
    }
}