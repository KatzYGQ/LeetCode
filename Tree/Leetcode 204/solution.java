//某公司架构以二叉树形式记录，请返回该公司的层级数。

输入：root = [1, 2, 2, 3, null, null, 5, 4, null, null, 4]
输出: 4
解释: 上面示例中的二叉树的最大深度是 4，沿着路径 1 -> 2 -> 3 -> 4 或 1 -> 2 -> 5 -> 4 到达叶节点的最长路径上有 4 个节点。


class Solution {
    public int calculateDepth(TreeNode root) {
        if(root == null) return 0;

        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);

        return Math.max(left, right) +1;
    }
}
