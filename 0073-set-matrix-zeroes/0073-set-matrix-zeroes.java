class Solution {
    //TC: O(M*N)
    //SC: O(M+N)
    //approch
    /*
    in first pass find the i and j where the element is 0
    record the i and j
    in second pass replace the i and j to 0
    
    Why we need two pass
     as we might have moved from the element in first pass before finding the 0th element we cant change them
     so we are recording the i and j and doing it in second pass
    */
    public void setZeroes(int[][] matrix) {
        
    int R = matrix.length;
    int C = matrix[0].length;
        
    HashSet<Integer> row = new HashSet<>();
    HashSet<Integer> col = new HashSet<>();
        
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
            if(matrix[i][j] == 0){
                row.add(i);
                col.add(j);
            }
        }
    }
        
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
            if(row.contains(i) || col.contains(j)){
                matrix[i][j] = 0;
            }
        }
    }

    }
}