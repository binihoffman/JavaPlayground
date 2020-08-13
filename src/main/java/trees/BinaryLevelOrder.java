package trees;

import java.util.*;

//Breath first - BFS
class BinaryLevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        while (!queue.isEmpty()) {
            int l = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < l; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (!level.isEmpty()) {
                ret.add(level);
            }
        }
        return ret;
    }
}
