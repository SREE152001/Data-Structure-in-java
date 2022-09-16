class Solution {
    public int[] shuffle(int[] nums, int n) {
       /* int arr[]=new int[2*n];
        int p1[]=new int[n];
         int p2[]=new int[n];
        for(int i=0;i<nums.length/n;i++)
        {
            nums[i]=p1[i];
            
        }
        for(int j=nums.length/n;j<nums.length;j++)
        {
            nums[j]=p2[j];
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]%2!=0)
            {
                arr[k]=p1[k];
            }
            if(arr[k]%2== 0)
            {
                arr[k]=p2[k];
            }
        }
        return arr;*/
        int[] result = new int[2*n];
    int f_p=0;
    int s_p=n;
    for(int i=0;i<2*n-1;i+=2) //0 2 4     i=2 i+=2 i=4
    {
        if(f_p<n)
        {
           result[i]=nums[f_p++];  // i --> 0 2 4
           result[i+1]=nums[s_p++];//i+1 --> 1 3 5
        }
        else{
            break;
        }
        System.out.println();
    }
        return result;
    }
}