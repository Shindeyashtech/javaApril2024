import java.io.*;
class GetSpeaker{

 public String speaker = "speaker enable";

}
class GetCamera extends GetSpeaker {

 public String camera = "Camera enable";

}
class GetSim extends GetCamera  {

public String sim = "sim enable";

}
class Mobile
{

public static void main ( String []args )
{	

GetSim c1 = new GetSim();

System.out.println(c1.speaker + c1.camera+ c1.sim); 
}
}