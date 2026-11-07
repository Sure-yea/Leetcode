class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        left=Math.max(0,left);
        right=Math.min(words.length,right);
        
        char l;
        char r;
        int ans=0;

        for(int i=left; i<=right; i++){
            l=words[i].charAt(0);
            r=words[i].charAt(words[i].length()-1);
            
            if( (l=='a' ||  l=='e' ||  l=='i' ||  l=='o' ||  l=='u') &&
                (r=='a' ||  r=='e' ||  r=='i' ||  r=='o' ||  r=='u')    ){
                    ans++;
                }
        }
        return ans;
    }
}