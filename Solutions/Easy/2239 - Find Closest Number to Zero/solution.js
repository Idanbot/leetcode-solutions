/**
 * @param {number[]} nums
 * @return {number}
 */
var findClosestNumber = function (nums) {
    let minDelta = Infinity;
    let closestNumber = nums[0];

    for (let i = 0; i < nums.length; i++) {
        const delta = Math.abs(nums[i] - 0);
        if (delta < minDelta || (delta === minDelta && nums[i] > closestNumber)) {
            minDelta = delta;
            closestNumber = nums[i];
        }
    }

    return closestNumber;
};


function runTests() {
    const testCases = [
        { input: [-4, -2, 1, 4, 8], expected: 1 },
        { input: [2, -1, 1], expected: 1 },
        { input: [-10, -5, 3, 5], expected: 3 },
        { input: [-100, -50, -1], expected: -1 },
        { input: [2,1,1,-1,100000], expected: 1 }
    ];

    testCases.forEach(({ input, expected }, index) => {
        const result = findClosestNumber(input);
        const status = result === expected ? '✅' : '❌';
        console.log(`${status} Test ${index + 1}: Input: [${input}] -> Output: ${result} | Expected: ${expected}`);
    });
}

runTests();