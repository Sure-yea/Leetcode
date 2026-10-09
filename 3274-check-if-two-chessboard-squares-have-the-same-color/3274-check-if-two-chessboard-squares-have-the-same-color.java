class Solution {
    public int mod(int a){
        return (a<0)?-a:a;
    }
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // int x1= coordinate1.charAt(0)-'a'+1;
        // int y1= coordinate1.charAt(1)-'0';
        // int x2= coordinate2.charAt(0)-'a'+1;
        // int y2= coordinate2.charAt(1)-'0';
        
    
        return mod((coordinate1.charAt(0)-'a'+1-coordinate2.charAt(0)-'a'+1)+(coordinate1.charAt(1)-'0'-coordinate2.charAt(1)-'0'))%2==0;
    }
    
}