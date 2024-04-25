public class MultiT {
    // runabble interface
    public static void main(String[] args) {
        int i = 7;
        for (i = 0; i <= 7; i++) {
             
            Thread t1 = new Thread( new interfaceMulti() );
            t1.start();
        }
    }
}
class interfaceMulti implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        try {
            System.out.println("Thread   " + Thread.currentThread() + "  is running \n");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("caught");
        }
    }
