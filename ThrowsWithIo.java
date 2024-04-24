import java.io.*;
import java.util.Scanner;

public class ThrowsWithIo {
    public static void main(String[] args) {
        System.out.println();
        Main1 m1 = new Main1();
        try {
            m1.checkAge();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}

class Main1 {
    void checkAge() throws IOException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            throw new IOException("User age is minor");
        } else {
            System.out.println("Age is major");
        }
    }
}
