package trees;

public class LowestCommonAncestor {

    //The logic is pretty simple - if the 2 numbers are not in the same subtree then return the root
    public TreeNode lowestCommonAncessor(TreeNode root, int p, int q)
    {
        if (p > root.val && q > root.val)
            return lowestCommonAncessor(root.right, p, q);
        else if (p < root.val && q < root.val)
            return lowestCommonAncessor(root.left, p, q);
        else return root;

    }
}
