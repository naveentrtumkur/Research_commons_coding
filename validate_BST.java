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
    public boolean isValidBST(TreeNode root) {
        
        return isvalidbst(root,null,null);
        
    }
    
    
    public boolean isvalidbst( TreeNode root, TreeNode min, TreeNode max)
    {
        if(root == null)
            return true;
        
    if((min!=null && root.val<=min.val) || (max!=null && root.val >=max.val))
        return false;
        
    if(!isvalidbst(root.left,min,root) || !(isvalidbst(root.right,root,max)))
        return false;
        
        return true;
        
    }
}
