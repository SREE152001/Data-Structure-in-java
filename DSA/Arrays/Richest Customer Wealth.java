class Solution {
    public int maximumWealth(int[][] accounts) {
         int max = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[0].length; j++){
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
        
    }
}
/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/