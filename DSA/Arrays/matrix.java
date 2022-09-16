/*
Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
*/


class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result=new int[m][n];
         int row=0,col=0,temp=0;
        /*
        [000
         000]m*n
         
         // result[0].length = No of Column
        // result.length = No of Rows
        */
        
        for(int i=0;i<indices.length;i++)
        {
            row=indices[i][0];//0 1
            for(int j=0;j<result[0].length;j++)//indic[0]--->0,1
                result[row][j]=result[row][j]+1;
            
            col=indices[i][1];//1 1
            for(int j=0;j<result.length;j++)//indic[0]--->0,1
                result[j][col]=result[j][col]+1;
            
        }
        
        for(int i=0;i<result[0].length;i++)//row and colum  n n n
        {                                            //n n n
            for(int j=0;j<result.length;j++)
            {
                if(result[j][i]%2!=0)
                {
                    temp++;
                }
            }
        }
        return temp;
    }
}s