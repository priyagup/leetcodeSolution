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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resultList = new ArrayList<>();
        if(root == null ) return null;
        helper(root, \\, resultList);

        return resultList;
    }

    public void helper(TreeNode root, String str, List<String> resultList){
       if(root == null) return ;

        if(!str.isEmpty()){
            str = str + \->\ + root.val;
        }else {
            str = String.valueOf(root.val);
        }
        
        if(root.left == null && root.right == null){
             resultList.add(str);
             return;
        }
        helper( root.left, str, resultList);
        helper (root.right, str, resultList);
    }
}