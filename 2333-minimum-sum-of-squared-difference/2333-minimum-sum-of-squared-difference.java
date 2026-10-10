class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int[] diff= new int[n];
        for(int i=0;i<n;i++){
            if(nums1[i]-nums2[i]>0){
                diff[i]=nums1[i]-nums2[i];
            }
            else{
                diff[i]=-nums1[i]+nums2[i];
            }
        }

        int max=0;
        for(int j=0;j<n;j++){
            if(max<diff[j]){
                max=diff[j];
            }        
        }

        long[] cnt= new long[max+1];
        for(int ele: diff){
            cnt[ele]++;
        }


        long k=(long)k1+k2;

        for(int d=max;d>=1;d--){
            if(k==0) break;
            if(cnt[d]==0) continue;       
            long move=Math.min(cnt[d],k);
            cnt[d]-=move;                  
            cnt[d-1]+=move;             
            k-=move;
        }
        long sum=0;
        for(int d=1;d<=max;d++){
            sum+=cnt[d]*d*d;               
        }

      
        return sum;
    }
}