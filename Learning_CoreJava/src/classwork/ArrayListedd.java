package classwork;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListedd {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Ronak");
		a.add(23);
		a.add('a');
		a.add(10);
		a.add(2,"Ronak");
	
		ArrayList <Integer> b = new ArrayList<Integer>();
		b.add(44);
		b.add(22);
		b.add(33);
		b.add(420);
		b.remove(1);
		b.set(2,44);
		for (Integer i : b) {
			System.out.println(i);
		}
	


		b.addAll(a);
		Iterator<Integer> o=b.iterator();
		while(o.hasNext()) {
			System.out.println(o.next());
		}
		
		
}
}
