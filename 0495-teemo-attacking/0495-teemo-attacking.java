class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisoned=0;
        int n=timeSeries.length;
        int dist=0;
        if(n==1) return duration;
        for(int i=1;i<n;i++){
            dist=(timeSeries[i]-timeSeries[i-1]);
            if(duration>dist){  //overlap
                poisoned+=(timeSeries[i]-timeSeries[i-1]);
            }
            else{//duration less then no overlap
                poisoned+=duration;
            }
            
  
        }
    
    
    
    return poisoned+duration;
    }
}