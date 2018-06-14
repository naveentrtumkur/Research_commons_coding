// first attempt to solve the problem.

class Solution {
    public void setZeroes(int[][] matrix) {
        
        //Find the row_length and col_length
        int rlen = matrix.length;
        int clen = matrix[0].length;
        
        int frow = 1;
        for(int i=0; i<rlen;i++)
        {
            if(matrix[0][i] == 0)
            {
                
                frow = 0;
                break;
                
            }
        }
        int fcol = 1;
        for(int j=0; j<clen;j++)
        {
            if(matrix[j][0] == 0)
            {
                fcol = 0;
                break;
            }
        }
        
        for(int i=1;i<rlen;i++)
        {
            for(int j=1;j<clen;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    
                }
                
            }
        }
         
        for(int i=1;i<rlen;i++)
        {
            for(int j=1;j<clen;j++)
            {
                
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
                
            }
        }
        
        //Set the values for first row and first column if the flags are set.   
        if(frow == 0)
        {
            for(int i=0;i<clen;i++)
            {
                matrix[0][i] = 0;
            }
            
        }
        
        
        if(fcol == 0)
        {
            for(int i=0;i<rlen;i++)
            {
                matrix[i][0] = 0;
            }
        }
        
        //return matrix;
        
        }
        
    }


