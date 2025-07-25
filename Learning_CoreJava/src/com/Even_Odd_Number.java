package com;

public class Even_Odd_Number {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			int number = i;
			if(number%2==0) {
				System.out.println(number+" is even");
			}
			else {
				System.out.println(number+" is odd");
				
			}
		}
	}

}
