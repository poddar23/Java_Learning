package classwork;

public class StringReverse {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Sitesh always comes late to class");
		StringBuilder temp=new StringBuilder(sb);
		sb.reverse();
		System.out.println(sb);
	}
}

