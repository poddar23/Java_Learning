package com;

public class Pelindrom {
	public static void main(String[] args) {
		
		int number = 121;
		int temp = number;
		int rnum =0;
		while(number!= 0)
		{
			int rem = number%10;
			rnum =(rnum*10)+rem;
			number/=10;
		}
		if(rnum==temp)
		{
			System.out.println("Pelidrom");
		}
		else
		{
			System.out.println("Not Pelidrom");
		}
	}

}
