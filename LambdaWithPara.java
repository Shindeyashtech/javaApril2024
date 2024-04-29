 
interface InnerLambdaWithPara {
    String in(String name);
}

public class LambdaWithPara {
    public static void main(String[] args) {

        InnerLambdaWithPara i = (name) -> {
            return "Raj " + name;  
        };
        System.out.println(i.in("yash"));
    }
}
