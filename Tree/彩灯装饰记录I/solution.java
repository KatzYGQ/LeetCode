// 一棵圣诞树记作根节点为 root 的二叉树，节点值为该位置装饰彩灯的颜色编号。
// 请按照从 左 到 右 的顺序返回每一层彩灯编号。
// 输入：root = [8,17,21,18,null,null,6]
// 输出：[8,17,21,18,6]


  class Solution {
    public int[] decorateRecord(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        ArrayList<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

        int[] arr=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i]=ans.get(i);
        }

        return arr;
    }
}
