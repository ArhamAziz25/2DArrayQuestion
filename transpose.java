class Solution {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        // if(matrix == null || matrix.length == 0)
        //     System.out.println(new int[matrix.length][matrix[0].length]); 

        int[][] result = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < result.length; row++)
            for(int column = 0; column < result[0].length; column++)
                result[row][column] = matrix[column][row];
        System.out.println(result);       
    } 
    }
