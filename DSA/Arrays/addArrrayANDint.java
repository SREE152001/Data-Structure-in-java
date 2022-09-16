/*
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
*/


class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
	 String[] strArray = new String[num.length];
 
        for (int i = 0; i < num.length; i++) {
            strArray[i] = String.valueOf(num[i]);
        }
        int[] n=new int[num.length];
        for(int i=0;i<num.length;i++)
        {
           n[i] = Integer.parseInt(String.valueOf(strArray[i]));
        }
          StringBuilder s = new StringBuilder(); 

    for (int i : n)
    {
         s.append(i);
    }
    
    
   String str=s.toString();
   int number= Integer.parseInt(str);
   int addnum=number+k;
   String temp = Integer.toString(addnum);
 List<Integer> result = new ArrayList<>();
    for(int i = 0; i < temp.length(); i++) {
      result.add(temp.charAt(i) - '0'); // always returns 0
    }

String temp = Integer.toString(addnum);
int[] result = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
    result[i] = temp.charAt(i) - '0';
    
}
      return result;
       
        
    }
}