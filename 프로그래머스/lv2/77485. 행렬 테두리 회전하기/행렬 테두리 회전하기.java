class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] matrix = new int[rows + 1][columns + 1];
        
        int count = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                matrix[i][j] = count++;
            }
        }
        
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int r1 = queries[i][0];
            int c1 = queries[i][1];
            int r2 = queries[i][2];
            int c2 = queries[i][3];
            
            int min = Integer.MAX_VALUE;
            
            int start = matrix[r1][c1];
            
            for (int row = r1 + 1; row <= r2; row++) {
                matrix[row-1][c1] = matrix[row][c1];
                if (min > matrix[row-1][c1]) min = matrix[row-1][c1];
            }
            
            for (int col = c1 + 1; col <= c2; col++) {
                matrix[r2][col-1] = matrix[r2][col];
                if (min > matrix[r2][col-1]) min = matrix[r2][col-1];
            }
            
            for (int row = r2 - 1; row >= r1; row--) {
                matrix[row+1][c2] = matrix[row][c2];
                if (min > matrix[row+1][c2]) min = matrix[row+1][c2];
            }
            
            for (int col = c2 - 1; col > c1; col--) {
                matrix[r1][col + 1] = matrix[r1][col];
                if (min > matrix[r1][col+1]) min = matrix[r1][col+1];
            }
            
            matrix[r1][c1+1] = start;
            if (min > matrix[r1][c1+1]) min = matrix[r1][c1+1];
            
            answer[i] = min;
        }

        return answer;
    }
}