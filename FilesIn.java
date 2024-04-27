package NewPack;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class FilesIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream i1 = new FileInputStream("C:\\Users\\yashk\\Desktop\\dat.txt.txt");
//		int i = i1.read();
//		System.out.println((char)i);
//		
		 int data;
         while ((data = i1.read()) != -1) {
             System.out.print((char) data);
         }

		i1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
