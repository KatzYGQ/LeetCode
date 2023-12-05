class Solution {
    public int addDigits(int num) {
        int sum = num; 

        while (sum >= 10) {
            String str = String.valueOf(sum);
            sum = 0; // 重置sum为0

            for (int i = 0; i < str.length(); i++) {
                char char1 = str.charAt(i);
                int num1 = Character.getNumericValue(char1);
                sum += num1;
            }
        }

        return sum;
    }
}
