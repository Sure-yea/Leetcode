class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] found= new boolean[101];
        for(int ele: nums){
            found[ele]=true;
        }
        int find=k;
        while(find<=100){
            System.out.println(find);
            if(found[find]==false){
                return find;
            }
            find+=k;
        }
        return find;
    }
}