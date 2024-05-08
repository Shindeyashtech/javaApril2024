/**
 * DefaultMethod
 */


 /**
  * InnerDefaultMethod
  */
  interface InnerDefaultMethod {
    public void square(int a);

    default void show(){
    //  static void show(){
        System.out.println("default executed");
    }
     }
public class DefaultMethod implements InnerDefaultMethod {

    public void square(int a){
        System.out.println(a*a);
    }   
    public static void main(String[] args) {
        
//     DefaultMethod d1 = new DefaultMethod();
//     d1.square(2);
// d1.show();
// InnerDefaultMethod.show();
    

}
}