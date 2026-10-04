class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisoned=0;
        int n=timeSeries.length;
        if(n==1) return duration;
        for(int i=1;i<n;i++){
            if(duration>(timeSeries[i]-timeSeries[i-1])){  //overlap
                poisoned+=(timeSeries[i]-timeSeries[i-1]);
            }
            else{//duration less then no overlap
              
                poisoned+=duration;
            }
            
  
        }
    
    
    
    return poisoned+duration;
    }
}