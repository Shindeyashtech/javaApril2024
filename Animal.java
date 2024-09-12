      
abstract class AnimalAb {
 private String name;
 private int age;
public AnimalAb(String name, int age) {
    this.name = name;
    this.age = age;
}
public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public void setName(String name) {
    this.name = name;
}
public void setAge(int age) {
    this.age = age;
} 
public abstract void makeSound();

public void displayInfo(){
    System.out.println("Name :"+name+"Age" +age);
}

}
/**
 * InnerAnimal
 */
class  Dog extends AnimalAb {
    
    public Dog(String string, int age) {
        super(name, age);
     }
    public void makeSound(){
        System.out.println("Woof Woof !!");
    }

}

class Cat extends AnimalAb(){

    public cat(String name, int age) {
        super(name, age);
     }
     @Override
    public void makeSound(){
        System.out.println("Meow Meow !!");
    }
}
    
 
public class Animal {
    public static void main(String[] args) {
        System.out.println("Hello Welcome To Our Animal Information Application");
          AnimalAb dog = new Dog("Buddy",3);
          AnimalAb cat = new cat("Whiskers",2);


          System.out.println("Dog info");
          dog.displayInfo();
          dog.makeSound();
          
          System.out.println("cat info");
          cat.displayInfo();
          cat.makeSound();

    }
    
}
