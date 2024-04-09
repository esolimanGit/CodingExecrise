import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        ArrayList numbers = new ArrayList(n);
        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) numbers.add("FizzBuzz");
            else if (i % 3 == 0) numbers.add("Fizz");
            else if (i % 5 == 0) numbers.add("Buzz");
            else numbers.add(i + "");
        }
        return numbers;
    }
}
