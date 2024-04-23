import java.util.*;
public class Throw1 {
    public static void main(String[] args) {
        
         
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

if (age<18) {
    throw new ArithmeticException("voter is not valid");
    
} else {

    System.out.println("valid");
    
}



    }
    
}
