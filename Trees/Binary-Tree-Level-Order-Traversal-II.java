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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // DFS - Stack - Recursive Approch 
        List<List<Integer>> finalList = new LinkedList<>();
        helper(root, 0, finalList);
        Collections.reverse(finalList);
        return finalList;
    }

    public static void helper(TreeNode root, int level, List<List<Integer>> result ){
        if (root == null) return;
        if(level >= result.size() ){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        
        helper(root.left, level + 1, result);
        helper(root.right, level + 1, result);
    }
}

// DFS - Stack - Recursive Approch 

 /* // BFA - Level Order - Iterative Approch 
        List<List<Integer>> finalList = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        if(root == null) return finalList;

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> result = new LinkedList<>();
            for(int i=1; i<= level; i++){
                TreeNode current = queue.poll();
                
                result.add(current.val);

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
                
            }
            
            finalList.add(0,result);

        }
       // Collections.reverse(finalList);

        return finalList;
}
*/