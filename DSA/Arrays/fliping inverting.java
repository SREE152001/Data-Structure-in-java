/*Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/



class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      /*  int[] arr=new int[image.length];
   for(int i=0;i<=image.length;i++)
   {
        arr[i]=image[image.length-1];
      for(int j=0;j<=image.length;j++)
   {
       
        
      }  
     
  }
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]==0)
            {
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
        return arr;*/
        
       /* for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
               Collections.reverse(Arrays.asList(image[j]));
       
    
            }
        }*/
        int i =0;
        for(int [] mat : image){
            mat = flip(mat);
            mat = invert(mat);
            image[i++] = mat;
        }
        return image;
    }
	//flipping 
    public int[] flip(int [] mat){
        int i = 0;
        int j = mat.length-1;
        while(i < j){
            int temp = mat[i];
            mat[i++] = mat[j];
            mat[j--] = temp;
        }
        
        return mat;
    }
    //inverting
    public int[] invert(int [] mat){
       for(int i = 0; i < mat.length; i++){
            if(mat[i] == 1){
                mat[i] = 0;
            }
           else {
               mat[i] = 1;
           }
        }
        return mat;
        
        
    }
}