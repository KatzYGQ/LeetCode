
Given the root of a binary tree, invert the tree, and return its root.


Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []

//Solution 1
 class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}

//Solution 2

class Solution {
    public TreeNode invertTree(TreeNode root) {
 if (root == null) return null;
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            
            // 交换左右子节点
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            // 将左右子节点加入队列
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }
}
