class Solution {
    public boolean divisorGame(int n) {

        //1.dp数组
        boolean dp[] = new boolean[n+1];

        //3. 所以i==1的时就是false，i==2的时候就是true
       for(int i=1; i<=n;i++){
           if(i==1){
                dp[i]=false;
           }
           if(i==2){
                dp[i]=true;
           }

           //从下往上， 如果大于2，也就是数字来到了3，那么一定是3-1=(2)的相反结果
           //3==false
           //4==true
           if(i>2){
               dp[i]=!dp[i-1];
           }
       }


        return dp[n];
    }
}

//2. 我们发现如果number ==even, alice赢， 如果n= odd, bob赢
