class Solution {

    public int sod(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1; i<=num; i++){
            if(sod(i)%2==0) count++;
        }
        return count;
    }
}