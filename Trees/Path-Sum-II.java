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
     List<List<Integer>> resultList = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       helper(root, targetSum, new ArrayList<Integer>()) ;
        return resultList;
    }

    public  void helper(TreeNode root, int targetSum, List<Integer> result ){
        if (root == null) return;
        result.add(root.val);

        if(root.left == null && root.right ==null){
            if(targetSum == root.val){
                resultList.add(new ArrayList<>(result));
            }
        }

        if(root.left != null) helper(root.left, targetSum - root.val, result);
        if(root.right != null) helper(root.right, targetSum - root.val,result);

         result.remove(result.size() -1);
    }
}