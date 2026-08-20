class Solution {
    public String longestPalindrome(String s) {

        ArrayList<Character> max_palin=new ArrayList<>();
        ArrayList<Character> palin=new ArrayList<>();
        
        int max=0;
        
        int i=0;
        int j=0;
        int n=s.length();
        boolean even=false;

        for(int k=0;k<n;k++){
            palin.clear();
            palin.add(s.charAt(k));
            i=k-1;
            j=k+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                palin.add(s.charAt(j));
                i--;
                j++;
            }
            
            if(palin.size()*2-1>max){
                max=palin.size()*2-1;
                max_palin = new ArrayList<>(palin);
            }
            
        }


       
        
        palin.clear();
        i=0;
        j=0;
       
        for(int k=0;k<n;k++){
            palin.clear();
            
            i=k;
            j=k+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                palin.add(s.charAt(j));
                i--;
                j++;
                
            }
            
            if(palin.size()*2>max){
                max=palin.size()*2;
                max_palin = new ArrayList<>(palin);
                even=true;
            }
            
        }





        String ans="";
        int size=max_palin.size();


        if(size==0){
            ans+=s.charAt(0);
            return ans;
        }


        else if (even==false){

            for(int l=size-1;l>=0;l--){
                ans+=max_palin.get(l);
            }

            for(int m=1;m<size;m++){
                ans+=max_palin.get(m);
            }

        }
        
        else if (even==true){

            for(int l=size-1;l>=0;l--){
                ans+=max_palin.get(l);
            }

            for(int m=0;m<size;m++){
                ans+=max_palin.get(m);
            }

        }

        

        return ans;
    }
}