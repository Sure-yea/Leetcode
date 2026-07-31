class Solution {
    public int minimumPushes(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){        
            count= count +( (i+8)/8 );
        }
        return count;
    }
}