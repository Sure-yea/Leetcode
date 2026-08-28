class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        boolean hasKey = false;
        for(int[] subarr:nums){
            for(int ele :subarr){
                if(!count.containsKey(ele)){
                    count.put(ele,1);
                }
                else{
                    count.put(ele,count.get(ele)+1);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele: count.keySet()){
            if(count.get(ele)==nums.length) ans.add(ele);
        }
        ans.sort(null);
        return ans;
    }
}