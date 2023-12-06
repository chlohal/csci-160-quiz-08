# Quiz 8

## Staircase

This function has a time complexity of $O(n^2)$ because it contains two nested loops over the range `0..n`.

This function has a space complexity of $O(1)$ because it does not have any auxiliary variables.

## Alternating Characters

This function's can be recursively defined as follows:

> `a(s, i, n)` is the minimum number of deletions required to remove all adjacent matching characters in the string `s[i..]`, given that all adjacent matching characters in `s[..i]` can be removed with `n` deletions.


This function has a time complexity of $O(n)$ because each recursive call increases `i` by 1, and the base case occurs when `i` has reached the input's length.

This function has a space complexity of $O(1)$ because it does not have any auxiliary variables and it is tail recursive, so it doesn't need to store information on the stack.
