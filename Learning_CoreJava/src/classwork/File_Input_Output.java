package classwork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_Output {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\homee.txt");
			String str ="Hello java, Hello python 123";
			byte b[] = str.getBytes();
			fos.write(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fos!=null) {
				
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
