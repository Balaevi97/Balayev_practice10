import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Eve", "Charlie", "Daniel");

        // #1

        Stream<String> stream = names.stream();
        stream = stream.filter(item -> item.contains("e"));
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);

        // #2

        List<String> list1 = names.stream().filter(item -> item.contains("e")).collect(Collectors.toList());
        list1.forEach(item ->{
            System.out.println(item);
        });

    }
}
