
import java.util.List;
import java.util.Map;

class Solution {

    public record TestCase(String input, int expected) {

    }

    public int romanToInt(String s) {
        Map<Character, Integer> symbolToIntMap = Map.ofEntries(
                Map.entry('I', 1),
                Map.entry('V', 5),
                Map.entry('X', 10),
                Map.entry('L', 50),
                Map.entry('C', 100),
                Map.entry('D', 500),
                Map.entry('M', 1000));

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            Character currentSymbol = s.charAt(i);
            Character nextSymbol = '0';

            if ((i + 1) < s.length()) {
                nextSymbol = s.charAt(i + 1);
            }

            int currentValue = symbolToIntMap.get(currentSymbol);

            boolean isNextValueBefore = (nextSymbol != '0' && currentValue < symbolToIntMap.get(nextSymbol));

            result += isNextValueBefore ? -(currentValue) : currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        List<TestCase> testCases = List.of(
                new TestCase("LVIII", 58),
                new TestCase("III", 3),
                new TestCase("MCMXCIV", 1994));

        int i = 0;
        for (TestCase tc : testCases) {
            int output = new Solution().romanToInt(tc.input);
            String status = output == tc.expected ? "PASSED" : "FAILED";
            System.out.println(status + " Test " + (++i) + " Input: [" + tc.input + "] -> Output: " + output + " | Expected: " + tc.expected);
        }
    }
}
