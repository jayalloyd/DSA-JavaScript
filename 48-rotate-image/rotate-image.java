class Solution {
    public void rotate(int[][] matrix) {
    
    for(int i=0; i<matrix.length ;i++ ){         // Traverse the upper triangle of the matrix
        

        for (int j=i+1; j<matrix.length;j++){
            int temp=matrix[i][j];                 // Swap elements symmetrically across the diagonal

            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            
        }
    }  
    //reverse each row 
        for(int i=0;i<matrix.length;i++){
            int j=0,k=matrix.length-1;
            while(j<k){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[i][k];
                matrix[i][k]= temp;
                j++;
                k--;
            }
        }      
    }
        
}