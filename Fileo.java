package NewPack;

import java.io.FileOutputStream;

public class Fileo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\yashk\\Desktop\\dat.txt.txt");
			f1.write(65);
			f1.close();
			System.out.println("success");
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
//		File file = new File("dat.txt");
//		System.out.println("File path: " + file.getAbsolutePath());


	}

}
