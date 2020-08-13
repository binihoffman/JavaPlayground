package trees;


import java.util.LinkedList;
import java.util.List;




class PreOrder {
    List<Integer> results= new LinkedList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {


        if (root != null)
        {
            results.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }




        return results;
    }
}