

    import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFun1 {

    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(2, 3, 4, 5);

        // Create a stream of integers and map each element to its square
        Stream<Integer> square = num.stream().map(x -> x * x);

        // num.stream().map(x -> x*x).forEach(y-> System.out.println(y) );

        // Print the stream
        square.forEach(System.out::println);
    }
}

    

