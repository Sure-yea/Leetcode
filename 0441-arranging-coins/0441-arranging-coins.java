class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        while(n>=0){
            n-=count;
            count++;
        }
        return count-2;
        
    }
}