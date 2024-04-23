import java.util.*;

/**
 * InnerThrow
 */
class InnerThrow {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void id() {

        if (age < 18) {
            throw new ArithmeticException("voter is not valid");

        } else {

            System.out.println("valid");

        }

    }

}

public class Throw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InnerThrow i1 = new InnerThrow();
        i1.setAge(sc.nextInt());
        i1.id();
    }

}
