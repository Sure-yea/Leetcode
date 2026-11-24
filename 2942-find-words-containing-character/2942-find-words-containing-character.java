class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> ans=new ArrayList<>();
        String st=words[0];
        Boolean adding =false;
        for(int i=0; i<words.length; i++){
            adding=false;
            st=words[i];
            for(int j=0; j<st.length(); j++){
                if(x==st.charAt(j)) adding=true;
            }
            if(adding) ans.add(i);
        }
        return ans;
    }
}