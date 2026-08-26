class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int grid=matrix[0].length;
        if(grid==1) return matrix;
        int max=0;
        ArrayList<Integer> index=new ArrayList<>();
        boolean found=false;
        for(int col=0;col<matrix[0].length;col++){
            for(int row=0;row<matrix.length;row++){
                if(matrix[row][col]>max){
                    max=matrix[row][col];
                }
                if(matrix[row][col]==-1){
                    index.add(row);
                    found=true;
                }
            }
            if(found==true){
                for(int ele:index) matrix[ele][col]=max;
            }
            max=0;
            index.clear();
            found=false;
        }
        return matrix;
    }
}