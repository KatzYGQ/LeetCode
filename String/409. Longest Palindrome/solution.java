import java.util.Hashtable;

class Solution {
    public int longestPalindrome(String s) {
        Hashtable<Character, Integer> numbers = new Hashtable<Character, Integer>();

        // 计算每个字符的出现次数
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            numbers.put(c, numbers.getOrDefault(c, 0) + 1);
        }

        int sum = 0;
        boolean hasOdd = false;
        for (int count : numbers.values()) {
            if (count % 2 == 0) {
                sum += count; // 如果是偶数，全部加入
            } else {
                sum += count - 1; // 如果是奇数，减去1后加入
                hasOdd = true; // 标记存在奇数
            }
        }

        // 如果存在奇数，可以在中心位置加一个字符
        if (hasOdd) {
            sum += 1;
        }
        
        return sum;
    }
}

