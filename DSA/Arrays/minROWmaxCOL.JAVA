/*
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/


class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       /* List<Integer> arrayList = new ArrayList<Integer>();
        int[][] res=new res[1][1];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j]<matrix[i][j+1] && matrix[i][j]>matrix[j+1][i])
                {
                    res[i][j]=matrix[i][j];
                }
            }
        }
       // for(int i:res) {
        //arrayList.add(i);
    
        return res;*/
        
        
        ArrayList<Integer> list = new ArrayList<>();
    
    for(int i = 0;i < matrix.length; i++){     // finding mininum in row
        int psj = 0;                           
        int min = matrix[i][0];
        
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[i][j] < min){
                min = matrix[i][j];
                psj = j;                      // if we found min then put that j index as our psj
            }
        }
        
        boolean isTrue = true;
        for(int a = 0; a < matrix.length; a++){    // checking for max in column
            if(matrix[a][psj] > min){
                isTrue = false;
            }
        }
        
        if(isTrue == true){
            list.add(matrix[i][psj]);
        }
    }
    return list;
         
    }
}