2239. Find Closest Number to Zero

# Problem:
Given an integer array <code>nums</code> of size <code>n</code>, return the number with the value <b>closest</b> to <code>0</code> in <code>nums</code>. If there are multiple answers, return the number with the <b>largest</b> value.

### Example 1:

<b>Input:</b> nums = [-4,-2,1,4,8]

<b>Output:</b> 1

<b>Explanation:</b>

The distance from -4 to 0 is |-4| = 4.

The distance from -2 to 0 is |-2| = 2.

The distance from 1 to 0 is |1| = 1.

The distance from 4 to 0 is |4| = 4.

The distance from 8 to 0 is |8| = 8.

Thus, the closest number to 0 in the array is 1.


### Example 2:

<b>Input:</b> nums = [2,-1,1]

<b>Output:</b> 1

<b>Explanation:</b> 1 and -1 are both the closest 
numbers to 0, so 1 being larger is returned.

 

### Constraints:

<code>1 <= n <= 1000</code>

<code>-105 <= nums[i] <= 105</code>