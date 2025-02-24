from typing import List

class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        return max(nums, key=lambda x: (-abs(x), x))

def run_tests():
    test_cases = [
        ([-4, -2, 1, 4, 8], 1),
        ([2,-1,1], 1),
        ([-10, -5, 3, 5], 3),
        ([-100, -50, -1], -1)
    ]

    for i, (nums, expected) in enumerate(test_cases, 1):
        result = Solution().findClosestNumber(nums)
        print(f"{'✅' if result == expected else '❌'} Test {i}: Input: {nums} -> Output: {result} | Expected: {expected}")

run_tests()
