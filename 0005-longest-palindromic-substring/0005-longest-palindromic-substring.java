class Solution {
    public String longestPalindrome(String s) {

        
        String max_palin="";
        int max=0;
        
        String palin="";
        int i=0;
        int j=0;
        int n=s.length();
        // if(s.length()==1) return s;
        for(int k=0;k<n;k++){
            palin="";
            palin+=s.charAt(k);
            i=k-1;
            j=k+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                palin=s.charAt(i)+palin+s.charAt(j);
                i--;
                j++;
            }
            
            if(palin.length()>max){
                max=palin.length();
                max_palin=palin;
            }
            
        }


       
        
        palin="";
        i=0;
        j=0;
       
        for(int k=0;k<n;k++){
            palin="";
            
            i=k;
            j=k+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                palin=s.charAt(i)+palin+s.charAt(j);
                i--;
                j++;
                
            }
            
            if(palin.length()>max){
                max=palin.length();
                max_palin=palin;
            }
            
        }

        if(max_palin.length()==0) max_palin+=s.charAt(0);
        return max_palin;
    }
}