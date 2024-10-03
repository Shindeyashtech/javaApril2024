   abstract class Animal {
public abstract void animalsound();
public void sleep(){
System.out.println("AAHHHH");
}
}
class Pig extends Animal{
public void animalsound(){
System.out.println("this pig says : wee wee");
}
}
class Abtrac{
public static void main(String args[]){
Pig p1 = new Pig();
p1.animalsound();
p1.sleep();
}
}
