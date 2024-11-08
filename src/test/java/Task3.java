import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Eve", "Charlie", "Daniel");

        List<String> orderByAlphabet = names.stream().sorted().collect(Collectors.toList());
        int gameoreba = 0;
        while (gameoreba < names.size()) {
            System.out.println(orderByAlphabet);
            break;
        }
    }
}
