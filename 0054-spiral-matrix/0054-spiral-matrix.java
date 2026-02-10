class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
     {
        List<Integer>ans= new ArrayList<>();
        if(matrix.length ==0) return ans;

       
        //left-right
        int n = matrix.length;
        int m = matrix[0].length;
        int top=0;
         int bottom=n-1;
         int left =0; 
         int right= m-1;
        
        
            
            while(top<=bottom && left<=right)
        {
        for(int j= left;j<=right;j++){
            ans.add( matrix[top][j]);    
        }
        top++;
        //top-bottom
for(int i = top;i<=bottom;i++)
{
   ans.add(matrix[i][right]);

}
right--;
      //right-left
      if(top<=bottom){
    for(int j= right;j>=left;j--)
    {
        ans.add(matrix[bottom][j]);
    }
    bottom--;
 }
 //Bottom - top
    if(left<=right)
    {
 for(int i = bottom;i>=top;i--){
   ans.add( matrix[i][left]); 
 }
 left++;
}
        }

   return ans;
    }
}




    
