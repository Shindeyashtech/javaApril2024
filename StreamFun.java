/**
 * StreamFun
 */
// import java.lang.reflect.Array;
import java.util.*;
// import java.util.stream.Collector;
import java.util.stream.Collectors;
// import java.util.stream.Stream;
public class StreamFun {

     
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(2,3,4,5);

        List<Integer> square =  num.stream().map(x -> x*x).collect(Collectors.toList());


        System.out.println(square);


    }
}