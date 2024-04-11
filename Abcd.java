import java.io.*;
class A  {
String a  ="A";
}
class B  extends A  {
String b  ="B";
}
class C extends B {
String c  ="C";
}
class D extends A  {
String d  ="D";
}
class Abcd  {
public static void main (String [] args)
{
C c1 = new C();
D d1 = new D();
 System.out.println( c1.a + c1.b + c1.c + d1.d);
}
};
