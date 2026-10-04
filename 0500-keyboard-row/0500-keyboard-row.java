class Solution {
    public String[] findWords(String[] words) {
        ArrayList<Integer> index=new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int row=0;
        int current=0;
        boolean include=true;
        String word="";
     
        String row1 = "qwertyuiop";
        for (char c : row1.toCharArray()) {
            map.put(c, 1);
        }

        // Second row: value 2
        String row2 = "asdfghjkl";
        for (char c : row2.toCharArray()) {
            map.put(c, 2);
        }

        // Third row: value 3
        String row3 = "zxcvbnm";
        for (char c : row3.toCharArray()) {
            map.put(c, 3);
        }


        for(int i=0;i<words.length;i++){
            word=words[i];
            word=word.toLowerCase();
            row=map.get(word.charAt(0));
            current=0;
            include=true;
            for(int j=1;j<word.length();j++){
                current=map.get(word.charAt(j));
                if(current!=row){
                    include=false;
                }
            }
            if(include) index.add(i);
        }


        int total=index.size();
        String[] ans=new String[total];
        for(int i=0;i<total;i++){
            ans[i]=words[index.get(i)];
        }
        
        return ans;
    }
}