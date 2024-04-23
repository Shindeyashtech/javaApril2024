public class Nested {
    public static void main(String[] args) {
        try {
            //int data = 50 / 0;
            try {
                // int data = 50/0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                Integer[] a = new Integer[5];
                a[0] = null; // Setting an array element to null
                int length = a[0].intValue();
            } catch (NullPointerException e) {
                System.out.println(e);
            }
            try {
                // int a[]= new int [5];
                // System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("oro");
    }
}
