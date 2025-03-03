package main //+

import "fmt"

func romanToInt(s string) int {
	symbolToIntMap := map[string]int{
		"I": 1,
		"V": 5,
		"X": 10,
		"L": 50,
		"C": 100,
		"D": 500,
		"M": 1000,
	}

	result := 0

	for i := range s {
		currentSymbol := string(s[i])
		nextSymbol := ""
		if i+1 < len(s) {
			nextSymbol = string(s[i+1])
		}
		currentValue := symbolToIntMap[currentSymbol]
		if nextSymbol != "" && currentValue < symbolToIntMap[nextSymbol] {
			result -= currentValue
		} else {
			result += currentValue
		}
	}
	return result
}

func main() {
	runTests()
}

func runTests() {
	testCases := []struct {
		input    string
		expected int
	}{
		{input: "LVIII", expected: 58},
		{input: "III", expected: 3},
		{input: "MCMXCIV", expected: 1994},
	}

	for i, testCase := range testCases {
		result := romanToInt(testCase.input)
		status := "❌"
		if result == testCase.expected {
			status = "✅"
		}
		fmt.Printf("%s Test %d: Input: [%v] -> Output: %d | Expected: %d\n", status, i+1, testCase.input, result, testCase.expected)
	}
}
