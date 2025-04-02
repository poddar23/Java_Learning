package array;
import java.util.Scanner;
public class ArrayFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int [size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value for index: "+i);
			a[i] = sc.nextInt();
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
