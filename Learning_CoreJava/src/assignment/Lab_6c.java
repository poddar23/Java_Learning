package assignment;

class K
{
	public void display()
	{
		System.out.println("Runing K class display");
	}
}

class L extends K
{
	@Override
	public void display() {
		System.out.println("Runing L class display");
		super.display();
	}
}
public class Lab_6c {
	public static void main(String[] args) {
		
		L l = new L();
		l.display();
		
		
	}
}
