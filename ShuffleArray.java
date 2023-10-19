import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            numbers.add(i);
        }

        // Shuffle the list
        Collections.shuffle(numbers);

        System.out.println("Shuffled array: " + numbers);
    }
}