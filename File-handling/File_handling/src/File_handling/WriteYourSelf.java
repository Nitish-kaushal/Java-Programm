package File_handling;

import java.io.File;
import java.io.FileOutputStream;

public class WriteYourSelf {

	public static void main(String[] args) {
		
		try {
		File f1=new File("Desktop-Local:\\Demand.txt");
		
		f1.createNewFile();
//		FileOutputStream fos=new FileOutputStream(f1);
        System.out.println("File is created in Desktop..");
		}catch(Exception ee) {
			System.out.println("file path is wrong");
			System.out.println(ee);
		}

	}

}
