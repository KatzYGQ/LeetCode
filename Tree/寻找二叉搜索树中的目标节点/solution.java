
// 某公司组织架构以二叉搜索树形式记录，节点值为处于该职位的员工编号。请返回第 cnt 大的员工编号。

//Solution 1: 二叉树中序遍历逆序 右中左

// 中序遍历是递增序列也就是从小到大访问，那么逆序就是从大到小
class Solution {
    private int count = 0;
    private int result = 0;

    public int findTargetNode(TreeNode root, int cnt) {
        traverse(root, cnt);
        return result;
    }

    private void traverse(TreeNode node, int cnt) {
        if (node == null) return;
        traverse(node.right, cnt); // 先访问右子树
        if (++count == cnt) {
            result = node.val; // 找到第cnt大的元素
            return;
        }
        traverse(node.left, cnt); // 然后访问左子树
    }
}
