package classwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Test_Fileio {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your email ID: ");
	        String email = scanner.nextLine();
	        
	        try {
	        	FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\email.txt");
	        
	            fos.write(email.getBytes());
	        
	            System.out.println("Email ID saved successfully to email.txt");
	        } catch (IOException e) {
	            System.out.println("An error occurred while saving the email.");
	            e.printStackTrace();
	        }
	        
	        scanner.close();
	    }
	}



