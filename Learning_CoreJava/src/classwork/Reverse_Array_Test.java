package classwork;

public class Reverse_Array_Test {
	
	public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = array[length - 1 - i];
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int val : original) {
            System.out.print(val + " ");
        }

        int[] reversed = reverseArray(original);

        System.out.println("\nReversed Array:");
        for (int val : reversed) {
            System.out.print(val + " ");
        }
    }
}

