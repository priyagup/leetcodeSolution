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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null ) return root2;
        if(root2 == null) return root1;

        root1.val += root2.val;
        
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

         return root1;
    }
}
/*
 public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.offer(new TreeNode[] {root1, root2});

        while (!queue.isEmpty()) {
            TreeNode[] current = queue.poll();
            TreeNode t1 = current[0], t2 = current[1];

            // Merge t2 into t1
            t1.val += t2.val;

            // Handle left child
            if (t1.left != null && t2.left != null) {
                queue.offer(new TreeNode[] {t1.left, t2.left});
            } else if (t1.left == null) {
                t1.left = t2.left;
            }

            // Handle right child
            if (t1.right != null && t2.right != null) {
                queue.offer(new TreeNode[] {t1.right, t2.right});
            } else if (t1.right == null) {
                t1.right = t2.right;
            }
        }

        return root1;
    }
    */