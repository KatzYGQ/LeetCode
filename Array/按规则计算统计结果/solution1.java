class Solution {
    public int[] statisticalResult(int[] arrayA) {
        if(arrayA == null) return arrayA;
        int[] arrayB=new int[arrayA.length];
        int sum=1;
        boolean isZero=false; //确认是否有0存在
        int countZero=0; //确认0的个数，如果大于1， 所有的数值都为0

        for(int i=0; i<arrayA.length; i++){
           if(arrayA[i]!=0){
           sum*=arrayA[i];
           }
           if(arrayA[i]==0) {
            isZero=true;
            countZero++;
           }

        }

        for(int i=0; i<arrayA.length;i++){
            if(arrayA[i]!=0 && isZero == false) arrayB[i]=sum/arrayA[i];
            if(arrayA[i]==0 && countZero <=1){
                arrayB[i]=sum;
            }
            if(arrayA[i]==0 && countZero >1){
                arrayB[i]=0;
            }
            
        }

        return arrayB;
    }
}
