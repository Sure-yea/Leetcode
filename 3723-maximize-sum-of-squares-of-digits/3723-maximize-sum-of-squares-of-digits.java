class Solution {
    public String maxSumOfSquares(int num, int sum) {

        int digits=0;
        int score=0;
        StringBuilder ans = new StringBuilder();
        if(sum>9*num) return "";
        
        int tempSUM=sum;
        while(tempSUM>=9 && num>0){
            // System.out.println("appended");
            ans.append('9');
            tempSUM-=9;
            num--;
            
        }

        // System.out.println(tempSUM);
        if(num>0){
            ans.append((char)(tempSUM+'0'));
            num--;
        }
        while(num>0){
            ans.append('0');
            num--;
        }
        
        return ans.toString();










           
    }
}