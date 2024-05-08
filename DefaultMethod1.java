/**
 * DefaultMethod
 */


 /**
  * InnerDefaultMethod
  */
/**
 * 
 */
 interface  InnerDefaultMethod1 {
  public void num2(int b);
  default void show(){
     System.out.println("default1 executed");
    
}}

  interface InnerDefaultMethod2 {
    public void num1(int a);
     default void show(){
        System.out.println("default executed");
    }
     }
    
public class DefaultMethod1 implements InnerDefaultMethod2 , InnerDefaultMethod1 {

    public void show(){
     InnerDefaultMethod2.super.show();  
     InnerDefaultMethod1.super.show(); 
         
    }   
    public static void main(String[] args) {
        
    DefaultMethod d1 = new DefaultMethod();
     d1.show();

}
}