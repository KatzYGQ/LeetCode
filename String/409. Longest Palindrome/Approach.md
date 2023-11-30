# Longest Palindrome Solution Explanation

Given a string `s` which consists of lowercase or uppercase letters, this solution finds the length of the longest palindrome that can be built with those letters. It's important to note that letters are case sensitive, meaning "Aa" is not considered a palindrome.

## Java Solution

解决方案首先创建一个 Hashtable 来计算字符串 s 中每个字符的频率。
遍历字符串：对字符串中的每个字符，它在 Hashtable 中增加该字符的计数。
计算回文长度：
然后，解决方案遍历 Hashtable 的值。对于每个计数，如果是偶数，则将其全部加入总和 sum。如果是奇数，则将其减去 1 后加入总和。这是因为在构建回文时，出现次数为奇数的字符可以使用它们的最大偶数次出现（减去1），而多余的一个字符可以放在回文的中间。
如果存在出现次数为奇数的字符，解决方案通过在 sum 中加 1 来考虑这个字符，这样可以把这个字符放在回文的中心位置。
返回结果：函数最后返回计算出的 sum，即可以构建的最长回文的长度。
