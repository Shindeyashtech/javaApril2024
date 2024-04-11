import java.io.*;
class Employee{
int salary =1000;
}
class Engineer extends Employee {
int benefits =6000;
}
class Compnay{
public static void main (String args[]){
Engineer E1 = new Engineer();
System.out.println("Salary:"+ E1.salary +"\n"+ "Benifits:"+E1.benefits);
}
};