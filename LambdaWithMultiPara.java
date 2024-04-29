
/**
 * InnerLambdaWithMultiPara
 */
 interface  Adding {
int add (int a ,int b);
    
}
public class LambdaWithMultiPara {
 public static void main(String[] args) {
    
     Adding a1 = (a,b)-> (a+b);
     System.out.println(a1.add(11,12));
     
     Adding a2 = (int a, int b) -> (a-b);
     System.out.println(a2.add(11, 12));

    }
}
