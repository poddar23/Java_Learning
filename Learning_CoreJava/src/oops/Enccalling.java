package oops;

public class Enccalling {
	public static void main(String[] args) {
		
	  AccessDemo demo = new AccessDemo();
	  
	  demo.setId(10);
	  demo.setName("Ronak");
	  
	  System.out.println(demo.getId()+" "+demo.getName());
  }
}