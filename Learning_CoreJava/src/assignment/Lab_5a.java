package assignment;

class MaxOfThree
{
	public static int findMax(int a, int b, int c) {
		
		int max = a;
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
	return max;
}
	}
public class Lab_5a {
	
	public static void main(String[] args) {
		
		System.out.println(MaxOfThree.findMax(100, 20, 50));	
 }
}




