package classwork;
import java.util.Iterator;

import java.util.LinkedHashSet;

public class LinkedHashetttt {
	public static void main(String[] args) {
		
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("Ronak");
		s.add("Shiv");
		s.add("kanha");
		s.add("monil");
		Iterator<String> i=s.iterator();
	    
		while(i.hasNext()) {
			System.out.println(i.next());
}
}		
	}

