import java.io.FileReader;
import java.io.IOException;
 
public class ThrowWithFileReaderAtMain   {
    public static void main(String[] args)  throws IOException   {  
FileReader file = new FileReader("file.txt");

System.out.println(file.read());
    }   
}
