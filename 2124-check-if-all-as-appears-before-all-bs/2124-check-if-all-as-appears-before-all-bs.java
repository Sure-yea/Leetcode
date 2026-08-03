class Solution {
    public boolean checkString(String s) {
        boolean b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b') b=true;
            else if(s.charAt(i)=='a'){
                if(b==true) return false;
            }
            
        }
        return true;
    }
}