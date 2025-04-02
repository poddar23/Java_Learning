package array;

public class Array {
	public static void main(String[] args) {
		
		int a[] = {10,2,5,6,45,89,41,52,67,9,18};
		
		
        int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
		int avg = sum/a.length;
		
		System.out.println(avg);
		
	}

}
