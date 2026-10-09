class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[51];
        int rightUnique = 0;

        for (int x : nums) {
            if (suffix[x]++ == 0) rightUnique++;
        }

        boolean[] seen = new boolean[51];
        int leftUnique = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            if (!seen[x]) {
                seen[x] = true;
                leftUnique++;
            }

            if (--suffix[x] == 0) rightUnique--;

            ans[i] = leftUnique - rightUnique;
        }

        return ans;
    }
}