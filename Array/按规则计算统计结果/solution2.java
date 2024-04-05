class Solution {
    public int[] statisticalResult(int[] arrayA) {
        int len = arrayA.length;
        if(len == 0) return new int[0];
        int[] arrayB = new int[len];
        arrayB[0] = 1;
        int tmp = 1;
        for(int i = 1; i < len; i++) {
            arrayB[i] = arrayB[i - 1] * arrayA[i - 1];
        }
        for(int i = len - 2; i >= 0; i--) {
            tmp *= arrayA[i + 1];
            arrayB[i] *= tmp;
        }
        return arrayB;
    }
}

作者：Krahets
