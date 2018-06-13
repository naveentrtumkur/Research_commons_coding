/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //MaxVal is a global variable which holds the maximum value of diameter.
    int maxVal = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxVal;
    }
    
    public int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        maxVal = Math.max(maxVal, left+right);
        
        return Math.max(left, right) + 1;
        
    }
    
    
    
}
