import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class PhoneNumberLetterCombination {
    /**
     * Example 1:
     * <p>
     * Input: digits = "23"
     * "a", "b", "c"
     * <p>
     * "ad", "ae","af"
     * "bd", "be", "bf"
     * "cd", "ce", "cf"
     * <p>
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * <p>
     * Example 2:
     * <p>
     * Input: digits = ""
     * Output: []
     * <p>
     * Example 3:
     * <p>
     * Input: digits = "2"
     * Output: ["a","b","c"]
     */
    public static String[] table = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        int[] digits = new int[]{2,3};
        List result = calculate(digits, digits.length);
        System.out.println(result.toString());

    }

    public static List<String> calculate(int[] digits, int length) {
        Queue<String> q = new LinkedBlockingDeque<String>();
        ArrayList<String> combinations = new ArrayList<String>();
        q.add("");
        while(!q.isEmpty()) {
            String s = q.remove();
            if(s.length() == length) combinations.add(s);
            else {
                String letter = table[digits[s.length()]];
                for (int i = 0; i < letter.length(); i++) {
                    q.add(s + letter.charAt(i));
                }
            }
        }
        return combinations;
    }
}
