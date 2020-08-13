package trees;

import java.util.LinkedList;
import java.util.List;

class InOrder {
    List<Integer> results = new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null)
        {
            inorderTraversal(root.left);
            results.add(root.val);
            inorderTraversal(root.right);
        }
        return results;
    }
}
