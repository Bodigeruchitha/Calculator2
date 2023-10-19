public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;
            if (current >= next) {
                result += current;
            } else {
                result -= current;
            }
        }
        return result;
    }

    public static int getValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            default:
                return 0; // Invalid character
        }
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
    }
}
