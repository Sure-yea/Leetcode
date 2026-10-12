class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre="";
        String letterToCheck="";
        int min=201;
        int len=0;
        for(String ele:strs){
            len=ele.length();
            if(min>len) min=len; 
        }
        boolean notSame=false;
        for(int letter=0;letter<min;letter++){
        
            for(int word=0;word<strs.length;word++){
                System.out.println(letter+" "+word);
                if(strs[word].charAt(letter)!=strs[0].charAt(letter)){
                    notSame=true;
                }
            }
            if(notSame==true) break;
            else pre+=strs[0].charAt(letter);
        }

        return pre;
    }
}