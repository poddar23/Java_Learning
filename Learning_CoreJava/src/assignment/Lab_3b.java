package assignment;

import java.util.Scanner;

public class Lab_3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Choice = sc.next();
		switch (Choice) {
		case "a":
			System.out.println("South Indian");
			break;
		case "b":
			System.out.println("Gujarati");
			break;
		case "c":
			System.out.println("Indian");
			break;
		default:
			System.out.println("Invalid input");
		}
		
	}

}
