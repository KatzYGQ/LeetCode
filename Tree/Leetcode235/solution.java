class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root.val < p.val && root.val <q.val) root=root.right;
            if(root.val > p.val && root.val > q.val) root=root.left;
            else break;
        }

        return root;
    }
}
