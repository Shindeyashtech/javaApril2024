import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            Main.CheckAge( sc.nextInt());
        System.out.println();

    }
    

}
class Main{

     static   void  CheckAge (int age) throws ArithmeticException {
        

        if (age < 18 ){
            throw new ArithmeticException ("user age minor");
        }else System.out.println("age is major");

    }

}

