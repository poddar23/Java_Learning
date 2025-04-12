package classwork;
public class Student{
	int id;
	String name;
	String email;
	
	public Student(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}

	@Override
	public String toString() {
		return "student2 [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
}
class Student1234 {
    public static void main(String[] args) {
     
        Student student1 = new Student(101, "Ronak", "ronak@example.com");

        System.out.println(student1);
    }
}
	
