import java.util.ArrayList;
import java.util.List;

public class MethodSat {
    public static void main(String[] args) {
List<String> names = new ArrayList<>();
names.add("y");
names.add("A");
names.add("S");
names.add("H");

System.out.println("Names are : ");
for(String name : names){
    System.out.println(name);
}        
System.out.println("Using Lambda : ");
names.forEach(s -> System.out.println(s));

System.out.println("using forEach");
names.forEach(System.out ::println);

    }
    
}
