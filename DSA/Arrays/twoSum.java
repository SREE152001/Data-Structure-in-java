/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[]=new int[2];
        int a;
        int ij;
        int i,j;
        for( i=0;i<nums.length;i++)
        {
            a=nums[i];
            for( j=i+1;j<nums.length;j++)
            {
                ij=a+nums[j];
             if(ij==target)
                 
             {
                 for(int c=0;c<sum.length;c++)
                 {
                     sum[c]=i;
                     c++;
                     sum[c]=j;
                     break;
                 }
             }
            }
       
            
        }
        return sum;
    }
}