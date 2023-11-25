class Solution {
    public int[] productExceptSelf(int[] nums) {
        //前缀乘积组
        int[] res = new int[nums.length];

        //第0位左边没有数字,所以默认应该是1
        res[0]=1;
        for(int i=1; i<nums.length;i++){
            //当前的前缀乘积等于前一位前缀乘积乘以前一位数字
            res[i]=res[i-1]*nums[i-1];

        }
        //后缀乘积的最后一位数也是1，因为右边没有数字
        int suffixLast=1;
        
        for(int i=nums.length-1; i>=0;i--){
            //计算后缀乘积
            //如果是最后一位，那么suffixLast就是1
            //每一位的前缀乘积乘以后缀乘积就是当前答案
            if(i==nums.length-1){
                suffixLast*=1;
                res[i]*=suffixLast;

            }
            //否则就是当前后缀乘积等于后一位后缀乘积乘以后一位数字
            else{
                suffixLast*=nums[i+1];
                res[i]*=suffixLast;
            }
        }

        return res;
    }
}
