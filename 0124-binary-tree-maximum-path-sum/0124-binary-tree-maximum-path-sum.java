/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum=  Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
     {
       solve(root);
        return maxSum;
     }
   private int solve (TreeNode root){
    if (root == null)
            return 0;
        int left =Math.max (0,solve(root.left));
        int Right = Math.max(0,solve(root.right));
        int CurrentPath=root.val+Right+left;
        maxSum = Math.max(maxSum,CurrentPath);

    
            return Math.max(left, Right) + root.val;
}
}


