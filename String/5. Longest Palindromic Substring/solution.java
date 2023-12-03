class Solution {
    public String longestPalindrome(String s) {
        //burte solution
        //if the length of the string <=1, return s
        if(s.length() <=1){
            return s;
        }

        //define max length 
        int maxLen=1;
        //create a string to store substring
        String maxStr=s.substring(0,1);

        for(int i=0; i<s.length(); i++){
            for(int j=i+maxLen; j<=s.length(); j++){
                //update max length and  longest substring
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){
                  maxLen=j-i;
                    maxStr=s.substring(i,j);
                }
            }

        }

        return maxStr;


    }


    private boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left < right){
            //once if not palindrome, return false
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            //keep looping to check if is palindrome
            left++;
            right--;

        }

        //if is successful loop the string, return true

        return true;


    }

}
