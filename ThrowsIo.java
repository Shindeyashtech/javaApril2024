import java.io.IOException;
import java.util.Scanner;

public class ThrowsIo {
    public static void main(String[] args) {

               System.out.println();

        Main m1 = new Main();
        m1.CheckAge();
    }
    

}
class Main3{

   void  CheckAge () throws IOException {
        

        Scanner sc = new Scanner(System.in);
        int age =( sc.nextInt());


        if (age < 18 ){
            throw new ArithmeticException ("user age minor");
        }else System.out.println("age is major");

    }

}

