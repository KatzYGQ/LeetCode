// 给定两棵二叉树 tree1 和 tree2，判断 tree2 是否以 tree1 的某个节点为根的子树具有 相同的结构和节点值 。
// 注意，空树 不会是以 tree1 的某个节点为根的子树具有 相同的结构和节点值 。


class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right, B) );
    }

    public boolean recur(TreeNode A, TreeNode B){
        if(B == null) return true;
        if(A == null || A.val != B.val ) return false;

        return recur(A.left, B.left) && recur(A.right, B.right);

    }
}
