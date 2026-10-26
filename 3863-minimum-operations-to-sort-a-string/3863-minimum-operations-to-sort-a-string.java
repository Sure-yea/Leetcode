class Solution {
    public int minOperations(String s) {
        char min='z';
        char max='a';
        int n=s.length();
        boolean sorted=true;
        for(int i=0;i<n;i++){

            if (i > 0 && s.charAt(i) < s.charAt(i-1)) sorted = false;

            if(s.charAt(i)<=min){
                min=s.charAt(i);
            }
            if(s.charAt(i)>=max){
                max=s.charAt(i);
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;
        if (min == s.charAt(0)) return 1;
        if (max == s.charAt(n - 1)) return 1;
        if (min != s.charAt(n - 1)) return 2;
        if (max != s.charAt(0)) return 2;

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min) return 2;
            if (s.charAt(i) == max) return 2;
        }

        return 3;
       
    }
}