package NewPack;
 import java.io.*;
public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\yashk\\Desktop\\dat.txt.txt");
			
			String s = "welcome to seed info ";
			byte b[]= s.getBytes();
			
			f1.write(b);
			f1.close();
			System.out.println("success");
			
			
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		File file = new File("file.txt");
		System.out.println("File path: " + file.getAbsolutePath());

		
		

	}

}//outputstream
