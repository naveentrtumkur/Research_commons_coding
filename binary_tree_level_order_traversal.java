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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
    
        List<List<Integer>> mylist = new ArrayList<>();
        if(root == null)
            return mylist;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int len = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                
                TreeNode cur = q.remove();
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
                
                temp.add(cur.val);
            }
            
            mylist.add(0,temp);
        }
        
        return mylist;
        
        
        
        
    }
}
