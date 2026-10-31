class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
         if(matrix==null ||matrix.length==0 ||matrix[0].length==0){
            return result;
         }
        int rowst=0;
        int rowend=matrix.length-1;
        int colst=0;
        int colend=matrix[0].length-1;
        while(rowst<=rowend && colst<=colend){
            for(int i=colst; i<=colend; i++){
                result.add(matrix[rowst][i]);
            }
            for(int j=rowst+1; j<=rowend; j++ ){
                result.add(matrix[j][colend]);
                
                
            }
            for(int i=colend-1; i>=colst; i--){
                if(rowst==rowend){
                    break;}
                 result.add(matrix[rowend][i]);
            }
            for(int j=rowend-1; j>rowst; j--){
                 if(colst==colend){
                    break;}
                 result.add(matrix[j][colst]);
                
                 }
            
            rowst++;
            rowend--;
            colst++;
            colend--;
        }
return result;
    }
}
