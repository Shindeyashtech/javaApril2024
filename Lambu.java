/**
 * InnerLambu
 */
 interface InnerLambu {

    public String in();

    
}
public class Lambu {

    public static void main(String[] args) {
        
        InnerLambu i = ()-> {
            return "Raj";
        };
        System.out.println(i.in());
    }
}