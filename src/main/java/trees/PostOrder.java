package trees;


import java.util.LinkedList;
import java.util.List;


class PostOrder {
    List<Integer> results = new LinkedList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null)
        {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            results.add(root.val);
        }
        return results;
    }
}