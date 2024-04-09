import java.util.HashMap;

public class RomanNumerals {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV")); //4
        System.out.println(romanToInt("XII")); //12
        System.out.println(romanToInt("LVIII")); //58 - L = 50, V= 5, III = 3.
        System.out.println(romanToInt("MCMXCIV")); //M = 1000, CM = 900, XC = 90 and IV = 4.
        System.out.print(romanToInt("DCXXI"));// D = 500, C = 100, X = 20, I = 1
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int seqSum = 0;
        int lastNum = 0;
        int currentNum = 0;
        boolean reset = false;

        for (int i = 0; i < s.length(); i++) {
            currentNum = romanMap.get(s.charAt(i));
            if (i == 0 || reset) {
                lastNum = currentNum;
                seqSum = lastNum;
                reset = false;
                continue;
            } //"XV"
            if (currentNum < lastNum) {
                result += seqSum;
                seqSum = currentNum;

            } else if (currentNum > lastNum) {
                result += currentNum - lastNum;
                reset = true;
                seqSum = 0;
            } else {
                seqSum += currentNum;
            }
            lastNum = currentNum;
        }
        if (seqSum > 0) result += seqSum;
        return result;
    }
}
