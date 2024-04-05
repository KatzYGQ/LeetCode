class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i< digits.length;i++){
            sb.append(digits[i]);
        }

        int num = Integer.parseInt(sb.toString())+1;

        String resultString=String.valueOf(num);;

        int[] array=new int[resultString.length()];

        for(int i=0; i<resultString.length(); i++){
            array[i]=resultString.charAt(i)-'0';
        }

        return array;



    }
}
