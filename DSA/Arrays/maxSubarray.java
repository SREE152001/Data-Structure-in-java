/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/


class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}