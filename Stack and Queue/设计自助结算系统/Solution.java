// 请设计一个自助结账系统，该系统需要通过一个队列来模拟顾客通过购物车的结算过程，需要实现的功能有：

// get_max()：获取结算商品中的最高价格，如果队列为空，则返回 -1
// add(value)：将价格为 value 的商品加入待结算商品队列的尾部
// remove()：移除第一个待结算的商品价格，如果队列为空，则返回 -1
// 注意，为保证该系统运转高效性，以上函数的均摊时间复杂度均为 O(1)

 
// 示例 1：
// 输入: 
// ["Checkout","add","add","get_max","remove","get_max"]
// [[],[4],[7],[],[],[]]
// 输出: [null,null,null,7,4,7]

// 示例 2：
// 输入: 
// ["Checkout","remove","get_max"]
// [[],[],[]]
// 输出: [null,-1,-1]



class Checkout {
    Deque<Integer> dq;
    Queue<Integer> qq;
    
    public Checkout() {
         dq = new LinkedList<>();
         qq = new LinkedList<>();
    }
    
    public int get_max() {
        if(dq.isEmpty()) {
            return -1;
        }
        return dq.peekFirst();
        
    }
    
    public void add(int value) {
        qq.add(value);
        while(!dq.isEmpty() && dq.peekLast() < value){
            dq.removeLast();
        }
        dq.addLast(value);
    }
    
    public int remove() {
        if(qq.isEmpty()){
            return -1;
        }
        if(qq.peek().equals(dq.peekFirst())){
            dq.removeFirst();
        }
        return qq.poll();
        
    }

}
