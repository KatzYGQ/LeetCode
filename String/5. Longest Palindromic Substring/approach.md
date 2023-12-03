# Longest Palindromic Substring in Java

## Problem Statement
Given a string `s`, the objective is to find the longest palindromic substring in `s`.

## Approach
The solution utilizes a brute force approach to identify the longest palindromic substring.

## Algorithm
1. **Edge Case Check**: If the length of `s` is less than or equal to 1, return `s` itself, as any single character or an empty string is trivially a palindrome.

2. **Initialization**:
   - Set `maxLen` to 1. This variable tracks the length of the longest palindrome found.
   - Initialize `maxStr` with the first character of `s` (`s.substring(0,1)`). This variable stores the longest palindromic substring found.

3. **Nested Loops**:
   - Outer loop (`i`) iterates over each character in the string.
   - Inner loop (`j`) starts from `i + maxLen` and goes up to the length of `s`. The `maxLen` offset optimizes the process by skipping substrings shorter than the current longest palindrome.

4. **Check and Update**:
   - Inside the inner loop, check if the current substring (`s.substring(i, j)`) is a palindrome and its length is greater than `maxLen`.
   - If both conditions are met, update `maxLen` to the new length (`j - i`) and `maxStr` to the current substring.

5. **Return Result**: Once both loops are complete, return `maxStr`.

## Helper Method: `isPalindrome(String s)`
- This method checks if a given string `s` is a palindrome.
- **Two Pointer Technique**:
  - Initialize two pointers: `left` at the start of the string and `right` at the end.
  - Loop until `left` is less than `right`:
    - If characters at `left` and `right` do not match, return `false`.
    - Increment `left` and decrement `right`.
- If the loop completes without finding a mismatch, return `true`.

## Time Complexity
- The time complexity is O(n^3), where n is the length of the string. This is because the nested loops contribute O(n^2), and for each substring, checking if it's a palindrome takes O(n).

## Space Complexity
- The space complexity is O(1), as the space used does not depend on the size of the input string.

## Conclusion
This brute force method is straightforward but not optimal for large strings due to its high time complexity. For larger strings, more efficient algorithms like Manacher's Algorithm or Dynamic Programming can be used.
