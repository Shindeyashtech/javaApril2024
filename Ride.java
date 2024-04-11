import java.io.*;

class Vehicle{

void run(){

System.out.println("Vehicle is move");

}

}


class Car extends Vehicle {

void run(){

System.out.println("Vehicle is move safe ");


}

}


class Ride {
public static void main (String args []){

Car c1 = new Car();
c1.run();

}

}