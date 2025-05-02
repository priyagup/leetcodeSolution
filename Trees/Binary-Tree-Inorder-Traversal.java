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
   

    public List<Integer> inorderTraversal(TreeNode root) {      
        //helper(root, result);
       // return result;
        List<Integer>  result = new LinkedList();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        if(root == null ) return result;
        while(current !=null || !stack.empty()){
            //go left
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            //back track 
            current = stack.pop();
            result.add(current.val);
            current = current.right;

       }
       return result;
    }

    public static void helper(TreeNode root, List<Integer> result){
        if(root == null )  return;
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}