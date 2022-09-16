class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result=0;
        /*for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                     result++; 
                    break;
                }
                   
                
            }
        }
        return result;*/
        //Combinatorics basics:
//Suppose a number appear n times. Then for making pairs you have to select any 2 from n numbers. This can be done in nCr ways which is equal to n*(n-1)/2
        
        int[] hash=new int[101];
        for(int i : nums)
            hash[i]++;
        for(int i=0;i<100;i++)
        {
            if(hash[i]>=2)
            {
                result += hash[i]*(hash[i]-1)/2;
            }
        }
         return result;
    }
   
}
/*

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/