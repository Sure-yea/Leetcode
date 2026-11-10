class Solution {
    public int maximumPopulation(int[][] logs) {
        
        Map<Integer, Integer> population = new HashMap<>();
        int max=0;
        int year=1950;


        for(int i=1950; i<2050; i++){
            
            for(int[] arr:logs){
                if(arr[0]<=i && i<arr[1]){
                    if(!population.containsKey(i)) population.put(i,1); 
                    else population.put(i, population.get(i)+1);

                    if(population.get(i)>max){
                        max=population.get(i);
                        year=i;
                    }
                }
            }         
        }

        return year;
    }
}