class Solution {
    public int minInsertions(String s) {
        int open = 0, insert = 0, i = 0, n = s.length();

        while (i < n) {
            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {
                // need "))": either already present, or add the missing one
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insert++;   // add missing second ')'
                    i++;
                }

                // match this "))" with an opening
                if (open == 0) insert++;  // add missing '('
                else open--;
            }
        }

        return insert + open * 2;
    }
}