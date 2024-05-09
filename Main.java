public class Main {

    public static void main(String[] args) {
        
        // Declare an uninitialized array of strings
        String[] a = null;
        String [] str = new String[10];
       
        try {
            // Try to access a member of the null reference
            System.out.println(a[0]);
            
        } catch (Exception e) {
            // Print the exception
            System.out.println(e);
        }
        try {
            String low = str[5].toLowerCase();
            System.out.println(low);
    
        } catch (Exception e) {
             
            System.out.println(e);
        }
    }
}
