package assignment;

class Student
{
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
}
public class Lab_4a {
	public static void main(String[] args) {
		Student student1 = new Student("Ronak", 22);
		student1.displayDetails();
	}

}
