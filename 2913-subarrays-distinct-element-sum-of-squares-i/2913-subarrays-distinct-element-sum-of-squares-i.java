class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=n;
        int distinct=0;
        Map<Integer, Integer> count = new HashMap<>();

        for(int size=2;size<=n;size++){
            count.clear();
            distinct=0;

            for(int j=0;j<size;j++){
                int x=nums.get(j);
                if(count.getOrDefault(x,0)==0){
                    distinct++;
                }
                count.put(x,count.getOrDefault(x,0)+1);
            }
            sum+=distinct*distinct;

            for(int i=size;i<n;i++){
                int out=nums.get(i-size);
                int in=nums.get(i);

                //exiting
                count.put(out,count.get(out)-1);
                if(count.get(out)==0){
                    distinct--;
                }

                //entering
                if(count.getOrDefault(in,0)==0){
                    distinct++;
                }
                count.put(in,count.getOrDefault(in,0)+1);

                sum+=distinct*distinct;
                sum=sum%1000000007;
            }
        }

        return sum;
    }
}