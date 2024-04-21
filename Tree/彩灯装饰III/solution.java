class Solution {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        Queue <TreeNode> queue= new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();

        if(root !=null ) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            for(int i=queue.size(); i>0; i--){
                TreeNode node = queue.poll();
                if(res.size() % 2 ==0) temp.addLast(node.val);
                else temp.addFirst(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            res.add(temp);
        }
        return res;
    }
}
