class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length == 0 || k == 0) return new int[0];

        Deque<Integer> deque=new LinkedList<>();

        //窗口的数量是nums的长度减去k+1
        int[] res =new int[nums.length-k+1];

        //未形成窗口的时候, 也就是从index 0 开始, [ , , 1], [, 3, -1] ...
        for(int i=0; i<k; i++){
            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        //处理第一个窗口[1,3,-1]
        res[0]=deque.peekFirst();

        //现在就形成了窗口
        for(int i=k; i<nums.length; i++){

            if(deque.peekFirst() == nums[i - k]){
                deque.removeFirst();
            }
                

            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }

        return res;
    }
}
