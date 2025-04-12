package assignment;
import java.util.Scanner;

public class Lab_2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int a;
		a=sc.nextInt();
		int b;
		b=sc.nextInt();
		
		int sum = a+b;
		int subs= a-b;
		float div =a/b;
		int multiple = a*b;
		boolean i = a==b;
		boolean t = a>b;
		System.out.println(sum);
		System.out.println(subs);
		System.out.println(div);
		System.out.println(multiple);
		System.out.println(i);
		System.out.println(t);
	
		
		
	}
}         
