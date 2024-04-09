// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Example 3:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

//Solution1: 先将String首位两段的空格使用trim()移除掉
//然后使用正则表达式将连续空格替换成一个空格显示
//然后从尾部开始遍历，当遇到一个空格后，将之前加入的字符串反转获得一个正常的单词放到一个新创建的sb1，将用来做记录的sb清零来记录下一个字符长度
//最后返回sb1

class Solution {
    public String reverseWords(String s) {
        String trimStr = s.trim();
        String trimmedStr = trimStr.replaceAll("\\s+", " ");
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        

        for(int i=trimmedStr.length()-1;i>=0;i--){
            if(trimmedStr.charAt(i) == ' '){
                sb1.append(sb.reverse());
                
                sb1.append(trimmedStr.charAt(i));
                sb.setLength(0);
            
            }else{
                sb.append(trimmedStr.charAt(i));
            }
            
        }

        if(sb.length()!=0){
            sb1.append(sb.reverse());
        }

        return sb1.toString();
        
    }
}
