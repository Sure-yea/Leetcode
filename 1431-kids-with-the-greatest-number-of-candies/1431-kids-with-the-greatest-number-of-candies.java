class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=0;

        for(int ele: candies){
            if(ele>max) max=ele;
        }

        for(int ele:candies){
            if(ele+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }

        return ans;
    }
}