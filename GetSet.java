class Person {
private int age;
private String name;
public String getName(){
return name ;}
public void setName(String name){
this.name = name;}
public int getAge(){
return age;}
public void setAge(int age){
this.age = age;}
}
class GetSet {
public static void main (String args[]){
Person p1 =new Person();
p1.setName("yash");
p1.setAge(18);
System.out.println(p1.getName()+" "+p1.getAge());
}};