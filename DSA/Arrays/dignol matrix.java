/*
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
*/


class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += mat[i][i];
        }
         for(int i=0;i<n;i++)
        {
            sum += mat[i][n-1-i];
        }
        if(n%2!=0)
        {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}