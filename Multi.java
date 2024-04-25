/**
 * Multi
 */
public class Multi {

    public static void main(String[] args) {

        int i = 7;
        for (i = 0; i <= 7; i++) {
            InnerMulti m1 = new InnerMulti();
            m1.start();

        }

    }
}

/**
 * InnerMulti
 */
class InnerMulti extends Thread {
    public void run() {
        try {
            System.out.println("Thread   " + Thread.currentThread() + "  is running");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("caught");
        }

    }

}