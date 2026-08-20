class Solution {
    public int mod(int a){
        if(a>=0) return a;
        else return -a;
    }

    int min=Integer.MAX_VALUE;
    int index=-1;

    public int nearestDrone(int[][] drones, int[] target) {
        int dist=0;
        for(int i=0;i<drones.length;i++){
            dist=  mod(drones[i][0]-target[0])  +  mod(drones[i][1]-target[1]);
            if(dist<min && dist<=drones[i][2]){
                min=dist;
                index=i;
            }
        }


        return index;
    }
}