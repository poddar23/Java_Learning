package com;
import java.util.*;

public class table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println("Table of Number " +n);
				for(int i=1;i<=10;i++) {
					System.out.println(n+" * "+i+" ="+(n*i));
				}
		
	}

}
