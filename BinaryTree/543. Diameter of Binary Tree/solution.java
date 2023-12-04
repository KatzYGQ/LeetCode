class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==null) return 0;

        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);

        return Math.max(height(root.left)+height(root.right)+2, Math.max(left,right));

        
    }

    public int height(TreeNode root){
            if(root==null) return -1;

            int left= height(root.left);
            int right=height(root.right);

            return Math.max(left,right)+1;
        }
}
