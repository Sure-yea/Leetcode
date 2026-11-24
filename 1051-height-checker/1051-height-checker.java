class Solution {
    public int heightChecker(int[] heights) {
        
        int[] count=new int[101];
        for(int ele: heights){
            count[ele]++;
        }


        int j=0;
        int ans=0;
        for(int ele:heights){
            while(j<101 && count[j]==0) j++;

            if(j!=ele){
                ans++;
            }
            count[j]--;
        }

        return ans;
    }
}