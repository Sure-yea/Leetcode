class Solution {
    public int minimumPushes(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            System.out.println(count+"    "+(i+9)/9);
            
            count= count +( (i+8)/8 );
        }
        return count;
    }
}