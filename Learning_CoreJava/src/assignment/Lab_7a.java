package assignment;

class StudentId
{
	String name;
	int age;
	public StudentId(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
	
	public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
	
}
public class Lab_7a {
	public static void main(String[] args) {
		
        StudentId s1 = new StudentId("Shiv", 25);
        s1.displayInfo();
	}

}
