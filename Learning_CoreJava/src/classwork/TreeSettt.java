package classwork;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSettt {
	public static void main(String[] args) {
		TreeSet<Integer>n=new TreeSet<Integer>();
		n.add(22);
		n.add(33);
		n.add(31);
		Iterator<Integer> i=n.iterator();
	    
		while(i.hasNext()) {
			System.out.println(i.next());
}
}
		
	}

