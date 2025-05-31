package classwork;

class Product
{
	String name;
	int Id;
	int Price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	Product(String name, int Id, int Price){
		System.out.println("Product Details");
		this.name = name;
		this.Id = Id;
		this.Price = Price;
	}
	
	void display() {
		System.out.println("Name: " + name + ",Id: " + Id + ", Price: " + Price);
	}
	
}
public class Practice_test {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.display();
		Product p2 = new Product("Iphone", 17 , 55000);
        p2.display();
	
	}

}
