import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");


        List<String > words1 = words.stream().map(String::toUpperCase).toList();

        // #1

        for (String item: words1) {
            System.out.println(item);
        }


        // #2

        for (String item: words) {
            // words1.add(item.toUpperCase());
            System.out.println(item.toUpperCase());
        }


        // #3

        System.out.println(words1);
    }
}
