
import java.util.List;

class Solution {

    public record TestCase(String input, int expected) {

    }

    public int romanToInt(String s) {

        int result = 0, value = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> value = 1000;
                case 'D' -> value = 500;
                case 'C' -> value = 100;
                case 'L' -> value = 50;
                case 'X' -> value = 10;
                case 'V' -> value = 5;
                case 'I' -> value = 1;
            }

            result += (value < prev) ? -(value) : value;
            prev = value;
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
