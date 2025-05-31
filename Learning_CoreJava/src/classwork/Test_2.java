package classwork;

import java.util.Scanner;

public class Test_2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char choice;

	        do {        
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter operator (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result;
	            

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case '/':
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("Result: " + result);
	                    } else {
	                        System.out.println("Error: Division by zero!");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid operator!");
	                    break;
	            }

	            System.out.print("Do you want to continue? (y/n): ");
	            choice = scanner.next().charAt(0);

	        } while (choice == 'y' || choice == 'Y');

	        System.out.println("Calculator closed.");
	    }
//	 String ch=null;
//	 do
//	 {
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("Enter number 1: ");
//	 double a = sc.nextInt();
//	 System.out.println("Enter number 2: ");
//	 double b = sc.nextInt();
//	 System.out.println("Enter Choice");
//	 System.out.println("1 : Add, 2 : Sub, 3 :Mul, 4 : Div");
//	 
//	 int choice =sc.nextInt();
//	 
//	  if(choice==1)
//	 {
//		 System.out.println("Addition is : "+(a+b));
//	 }
//	 else if(choice==2)
//	 {
//		 System.out.println("Substraction is : "+(a-b));	 
//      }
//	 else if(choice==3)
//	 {
//		 System.out.println("Multiplication is : "+(a*b));
//	 }
//	 else if(choice==4)
//	 {
//		 System.out.println("Division is: "+(a/b));
//	 }
//	 else
//	 {
//		 System.out.println("Invalid choice");
//	 }
//	 
//	 
//	 System.out.println("");
//	 
	 
	}
     


       
