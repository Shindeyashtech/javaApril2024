import java.util.Optional;

public class OptionalClasses {
    public static void main(String[] args) {
        
        String[] str = new String[10];
        str[5]= "welCOME";
         
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {
            String low = str[5].toLowerCase();
            System.out.println(low);
    
            
        } else {
            System.out.println("String is  not present");
            
        }
      }
}
