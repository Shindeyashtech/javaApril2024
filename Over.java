import java.io.*;

class Shape{
public void area (){
System.out.println("find area");
}
public void area (int r){
System.out.println("circule Area ="+3.14*r*r );
}
public void area (double b ,double h  ){
System.out.println("Traingle area " + b*h*0.5);
}
}


class Over {

public static void main (String []args)
{
   Shape s1 = new Shape();
  	s1.area();
s1.area(5);
s1.area(2.5 , 5.5);

}

}