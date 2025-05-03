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
    public boolean isSymmetric(TreeNode root) {
        if (root == null ) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        Boolean result = false;

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left != null && current.right != null ){
                if( current.left.val == current.right.val 
                && isMirror(current.left, current.right) 
                && isMirror(current.right, current.left)){
                    result = true;
                }
            }else if(current.left == null && current.right == null){
                result = true;
            }
        }
        return result;
    }
    private static boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;

    return (t1.val == t2.val)
        && isMirror(t1.left, t2.right)
        && isMirror(t1.right, t2.left);
    }
}