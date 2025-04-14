package assignment;

class A
{
	int a = 100;
	public void display()
	{
		System.out.println("Running display...");
	}
}

class B extends A
{
	int a = 25;
	public void test()
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("Running test...");
	}
}
public class Lab_6a {
	public static void main(String[] args) {
		
		B b = new B();
		b.test();
	}

}
