package classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Read {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\homee.txt");
			int i = fis.read();
			
			while (i !=-1) {
				char c =(char) i;
				System.out.print(c);
				i = fis.read();		
				}} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
