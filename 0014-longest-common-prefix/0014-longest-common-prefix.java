
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String subs=strs[0];
        for(int i=1;i<strs.length;i++){                               
           
            while(  !strs[i].substring(0,Math.min(subs.length(),strs[i].length())).equals(subs) ){
                
                if(subs.length()==0){
                    return "";
                }


                subs=subs.substring(0,subs.length()-1);
            }
            
        }
        return subs;
        
    }
}