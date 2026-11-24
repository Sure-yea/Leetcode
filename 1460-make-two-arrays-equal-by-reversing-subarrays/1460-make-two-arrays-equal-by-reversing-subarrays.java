class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=target.length;

        int[] check=new int[1001];

        for(int ele:arr){
            check[ele]++;
        }

        for(int ele:target){
            check[ele]--;
        }
        
        for(int ele:check){
            if(ele!=0) return false;
        }

        return true;
    }
}