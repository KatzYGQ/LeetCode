# Find All Anagrams in a String

## Problem Statement
Given two strings `s` and `p`, the task is to find all the start indices of `p`'s anagrams in `s`. The function should return an array of these starting indices. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Solution Approach

### Method: Sliding Window and Frequency Counting

#### Steps:

1. **Initialize Frequency Arrays**:
   - Two arrays `freq1` and `freq2` each of size 26 are used to store the frequency of characters (assuming only lowercase alphabets are involved).
   - `freq1` tracks the frequency of characters in the current window of `s`.
   - `freq2` tracks the frequency of characters in `p`.

2. **Set Up the First Window**:
   - If the length of `s` is less than that of `p`, return an empty list as `s` cannot contain an anagram of `p`.
   - Iterate over the length of `p`, updating `freq1` and `freq2` to set up the initial window.

3. **Compare Frequencies and Add First Match**:
   - Use `Arrays.equals` to compare `freq1` and `freq2`. If they are equal, it means a matching anagram is found at the start of `s`, hence add index 0 to the result list.

4. **Slide the Window Across `s`**:
   - Continue until the `end` index reaches the end of `s`.
   - In each iteration, decrease the frequency of the starting character and increase the frequency of the ending character of the window.
   - Again, use `Arrays.equals` to compare the updated `freq1` and `freq2`. If they are equal, it means a substring starting from `start+1` is an anagram of `p`, and this index is added to the result list.
   - Increment the `start` and `end` to slide the window.

5. **Return Results**:
   - After the loop concludes, return the list containing all the starting indices of anagrams of `p` found in `s`.

