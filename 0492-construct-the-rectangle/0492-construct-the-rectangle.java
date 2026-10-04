
class Solution {
    public int[] constructRectangle(int area) {
        int[] ans=new int[2];
        for(int i=(int)Math.sqrt(area);i>=1;i--){
            
            if(i==1){
                ans[0]=area;
                ans[1]=1;
            }

            else{

                if(area%i==0){
                    ans[0]=area/i;
                    ans[1]=i;
                    break;

                }
            }
        }
        
        return ans;
    }
}