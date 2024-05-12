import java.util.*;  
public class StackFun {

    public static void main(String args[]){  
        Stack<String> stack = new Stack<String>();  
        stack.push("Ayush");  
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  
        // The line `stack.pop();` in the code is removing the top element from the stack. In this
        // case, it removes the element "Garima" from the stack.
        stack.pop();  
        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        }  
        }  
    

