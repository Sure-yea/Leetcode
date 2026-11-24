class Solution {
    public int maximum69Number (int num) {
        String st=String.valueOf(num);
        int n=st.length();
        int index=-1;
        int ans=0;
        for(int i=0; i<n; i++){
            if(st.charAt(i)=='6'){
                index=i;
                break;
            }
        }

        if(index==-1) return num;

        else return num+3*(int)Math.pow(10,(n-index-1));
    }
}