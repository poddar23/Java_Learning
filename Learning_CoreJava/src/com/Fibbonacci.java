package com;

public class Fibbonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 1;
		
		System.out.print(a+" "+b);
		while(n<=10) {
			int c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			n++;
		}
		
	}

}
