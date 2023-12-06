class Solution {
    public int longestConsecutive(int[] nums) {


        HashSet<Integer> numSet = new HashSet<>();
        if(nums.length == 0){
          return 0;
        }

        for(int num : nums){
          numSet.add(num);
        }
        int totalCount=1;

        for(int num:nums){
          //设置起始位置
          if(!numSet.contains(num-1)){
              int currentP=num;
              int countN=1;
              while(numSet.contains(currentP+1)){
                currentP+=1;
                countN+=1;
              }
              
               totalCount = Math.max(totalCount, countN);

          }
        }

        return totalCount;
    }
}
