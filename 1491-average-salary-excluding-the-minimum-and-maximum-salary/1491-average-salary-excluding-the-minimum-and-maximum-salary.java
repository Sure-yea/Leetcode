class Solution {
    public double average(int[] salary) {
        
        double min=salary[0];
        double max=salary[0];
        double sum=0;
        for(int ele:salary){
            if(ele<min) min=ele;
            if(ele>max) max=ele;
            sum+=ele;
        }
        
        return (sum-min-max)/((double)salary.length-2);
    }
}