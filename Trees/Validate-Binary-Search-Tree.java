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
    public boolean isValidBST(TreeNode root) {
        if(root == null ) return true;
       Stack<TreeNode> stack = new Stack<>();
       TreeNode current = root;
        TreeNode pre = null;
       while(current != null || !stack.empty()){
            //got left 
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if(pre != null && current.val <= pre.val) return false;
            pre = current;
            current = current.right;
       }
       return true;
    }
}

/*
In-order Recursive

 private TreeNode pre = null;
 public boolean isValidBST(TreeNode root) {

         return helper(TreeNode root)
    }

    public boolean static helper(TreeNode root){
        if(root == null ) return true;
        
        if(!(node.left)) return false;

        if(root != null && root.val <= pre.val) return false;
        pre = root;

        return helper(node.right);
    }

}

*/