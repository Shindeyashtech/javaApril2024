import java.io.*;
import java.util.*;
public class Operation {
    public int a,b;
    public char option;
    Scanner sc = new Scanner(System.in);
public void setA(int a) {
    this.a = a;
}
public void setB(int b) {
    this.b = b;
}
public int getA() {
    return a;
}
public int getB() {
    return b;
}  
    public int addition(){       
        return a+b;
    }
    public int Subtraction(){
        return a-b;
    }
    public int multiplication (){
        return a*b;
    }
    public int division(){
        if (b !=  0) {
            return a/b;          
        } else {
            System.out.println("You can not divide by zero");
            return 0;
        }
    }
    public void printOperation (){
        
        System.out.println("Addition : A "); 
        System.out.println("Subtraction : B "); 
        System.out.println("Multiplication : C "); 
        System.out.println("Division : D "); 
        System.out.println("Exit: E");
   }
   public void showMenu(){
    do {            
        printOperation();
        System.out.println("Enter the operation");
         option = sc.next().charAt(0);
        switch (option) {
       case 'A':   
       System.out.println( "Addition : " + addition() + "\n"  );
       break;
       case 'B':  
       System.out.println( "Subtraction :" + Subtraction()+ "\n"  );
       break;
       case 'C':
       System.out.println( "Multiplication :" + multiplication()+ "\n" );
       break;
       case 'D':
       System.out.println( "Division :" + division()+ "\n" );
       break;
       case 'E':
       System.out.println("Exiting the program.");
       return;
       default:
       System.out.println("Invalid");
       break;
   }
} while ( option != 'E' );
   }
}
class Cal{
        public static void main(String[] args) {
        System.out.println("Enter Number 1 ");
        Scanner sc = new Scanner(System.in);    
        while (true) {      
            int a= sc.nextInt();
            System.out.println( "Enter Number 2 ");
            int b = sc.nextInt();        
         Operation o1 = new Operation();
            o1.setA(a);
            o1.setB(b);     
            o1.showMenu();     
 }}}