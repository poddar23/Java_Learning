package classwork;
import java.util.HashSet;
import java.util.Iterator;

public class HashSettt {
	public static void main(String[] args) {
			HashSet<String> s = new HashSet<String>();
			s.add("Ronak");
			s.add("Shiv");
			s.add("kanha");
			s.add("monil");
			s.add("monil");
			Iterator<String> i=s.iterator();
		    
			while(i.hasNext()) {
				System.out.println(i.next());
	}
	}
}
