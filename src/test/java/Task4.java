import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dog", "Cat", "Elephant", "Tiger", "Lion", "Ant");

        List<String > orderByAlphabet = words.stream().filter(item -> {
                    return   item.length() > 4;
                }).map(String::toLowerCase)
                .sorted()
                .toList();
        //    System.out.println(orderByAlphabet);

        orderByAlphabet.forEach(item ->{
            System.out.println(item);
        });
    }
}
