/*Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.*/

class Solution {
    public int largestAltitude(int[] gain) {
        int num=0;
        int  addednum=0;
        for(int i=0;i<gain.length;i++)
        {
            addednum+=gain[i];
            if(addednum>num)
            {
                num=addednum;
            }
        }
        return num;
    }
}